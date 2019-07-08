package com.orange.websocket;

import org.apache.commons.lang.StringUtils;
import org.java_websocket.WebSocket;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.*;
import java.util.Iterator;

/**
 * @program: WebChatScoket
 * @description: socketserver
 * @author: chengjiaqi
 * @create: 2019/06/27 09:54
 **/
@Component
public class ChatServer extends WebSocketServer implements ApplicationRunner {


    public ChatServer() {
    }

    public ChatServer(int port) throws UnknownHostException {
        super(new InetSocketAddress(port));
    }

    public ChatServer(InetSocketAddress address) {
        super(address);
    }

    /**
     * 触发连接事件
     */
    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        //this.sendToAll( "new connection: " + handshake.getResourceDescriptor() );
        //System.out.println("===" + conn.getRemoteSocketAddress().getAddress().getHostAddress());
        String userName = "";
        try {
            userName = URLDecoder.decode(handshake.getResourceDescriptor().trim(), "UTF-8");
            System.out.println("userName:" + userName);
            if (StringUtils.isNotBlank(userName)) {
                userjoin(userName.substring(11), conn);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }

    /**
     * 触发关闭事件
     */
    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {
//        不能同时关闭socket
        synchronized (this){
            userLeave(conn);
        }

    }

    /**
     * 客户端发送消息到服务器时触发事件
     */
    @Override
    public void onMessage(WebSocket conn, String message) {
        boolean res = false;
        String user = ChatServerPool.getUserByKey(conn);
        for(String name : ChatQueue.chatUser){
            if(name.equals(user)){
                ChatClientServerPool.sendMessage(message.toString());//向所有在线用户发送消息(目前是一对一)
                ChatServerPool.sendMessage(message.toString());//向所有在线用户发送消息(目前是一对一)
                res = true;
                break;
            }
        }
        if(!res){
            ChatServerPool.sendMessageToUser(conn,"请稍等");
        }
//        ChatClientServerPool.sendMessage(message.toString());//向所有在线用户发送消息(目前是一对一)
//        ChatServerPool.sendMessage(message.toString());//向所有在线用户发送消息(目前是一对一)
    }

    public void onFragment(WebSocket conn, Framedata fragment) {
    }

    /**
     * 触发异常事件
     */
    @Override
    public void onError(WebSocket conn, Exception ex) {
        ex.printStackTrace();
        if (conn != null) {
            //some errors like port binding failed may not be assignable to a specific websocket
        }
    }

    @Override
    public void onStart() {

    }


    /**
     * 用户加入处理
     *
     * @param user
     */
    public void userjoin(String user, WebSocket conn) {
        if (ChatServerPool.getOnlineUser().size() < 2) {
            ChatServerPool.addUser(user, conn);                   //向连接池添加当前的连接对象
            ChatClientServerPool.sendMessage("用户:" + user + "已连接，在线" + ChatServerPool.getOnlineUser().size() + "人");
            ChatServerPool.sendMessageToUser(conn,"您已连接，请咨询");//把当前用户加入到所有在线用户列表中
//            ChatClientServerPool.sendMessageToUser(conn, "用户:" + user + "已连接，在线" + ChatServerPool.getOnlineUser().size() + "人"); //向当前连接发送当前在线用户的列表
            ChatQueue.chatUser.add(user); //添加到聊天集合
        } else {
            ChatQueue.chatQueue.add(user);//添加到队列集合里
            ChatServerPool.addUser(user, conn);
            ChatServerPool.sendMessageToUser(conn, user+"，您好，当前排队第" + (ChatServerPool.getOnlineUser().size()-1)+"位"); //向当前连接发送当前在线用户的列表
        }
        System.out.println(ChatQueue.chatQueue.toString());
    }

    /**
     * 用户下线处理
     *
     * @param
     */
    public void userLeave(WebSocket conn) {
        boolean res = false;
        String user = ChatServerPool.getUserByKey(conn);
        for (String name : ChatQueue.chatQueue) {
            if (name.equals(user)) {
//                ChatServerPool.sendMessage(user + "已离开");
                ChatServerPool.removeUser(conn);
                Iterator<String> it = ChatQueue.chatUser.iterator();
                while (it.hasNext()){
                    if(it.next().equals(user)){
                        it.remove();
                        break;
                    }
                }
                if (ChatQueue.chatQueue.size() > 0) {
                    ChatQueue.chatUser.add(ChatQueue.chatQueue.get(0));
                    ChatQueue.chatQueue.remove(0);
                }
                res = true;

            }
        }
        if (!res) {
            boolean b = ChatServerPool.removeUser(conn);            //在连接池中移除连接
            if (b) {
                String joinMsg = user + "结束会话";
                ChatClientServerPool.sendMessage(joinMsg);               //向在线用户发送当前用户退出的消息
                Iterator<String> it = ChatQueue.chatUser.iterator();
                while (it.hasNext()){
                    if(it.next().equals(user)){
                        it.remove();
                    }
                }
                if (ChatQueue.chatQueue.size() > 0) {
                    ChatQueue.chatUser.add(ChatQueue.chatQueue.get(0));
                    ChatQueue.chatQueue.remove(0);
//                    Iterator<String> it = ChatQueue.chatUser.iterator();
//                    while (it.hasNext()){
//                        if(it.next().equals(user)){
//                            it.remove();
//                        }
//                    }
                }
            }
        }
        System.out.println("chatUser:"+ChatQueue.chatUser.toString());
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        int port = 8887; //端口
        ChatServer s = new ChatServer(port);
        s.start();
        System.out.println("socketServer 已启动，端口：" + s.getPort());
        try {
            String userName = URLEncoder.encode("官方小e","UTF-8");
            MyWebSocketClient myWebSocketClient = new MyWebSocketClient(new URI("ws://127.0.0.1:"+port+"/?userName="+userName));
            myWebSocketClient.connect();
            MyWebSocketClient.myWebSocketClient = myWebSocketClient;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
