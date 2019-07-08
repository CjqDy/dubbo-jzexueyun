package com.orange.websocket;

import org.apache.commons.lang.StringUtils;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.*;

/**
 * @program: WebChatScoket
 * @description:
 * @author: chengjiaqi
 * @create: 2019/06/27 13:07
 **/
@Component
public class ChatClient extends WebSocketServer implements ApplicationRunner {
    public ChatClient() {
    }

    public ChatClient(int port) throws UnknownHostException {
        super(new InetSocketAddress(port));
    }

    public ChatClient(InetSocketAddress address) {
        super(address);
    }

    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {

        String userName = "";
        try {
            userName = URLDecoder.decode(clientHandshake.getResourceDescriptor().trim(), "UTF-8");
            System.out.println("userName:" + userName);
            if (StringUtils.isNotBlank(userName)) {
                userjoin(userName.substring(11), webSocket);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    /**
     * 用户加入处理
     *
     * @param user
     */
    public void userjoin(String user, WebSocket conn) {
        if (ChatClientServerPool.getOnlineUser().size() < 2) {


            ChatClientServerPool.addUser(user, conn);                   //向连接池添加当前的连接对象
            ChatClientServerPool.sendMessage("用户:" + user + "已连接client，在线" + (ChatClientServerPool.getOnlineUser().size()-1) + "人");          //把当前用户加入到所有在线用户列表中
            ChatClientServerPool.sendMessageToUser(conn, "用户:" + user + "已连接client，在线" + (ChatClientServerPool.getOnlineUser().size()-1) + "人"); //向当前连接发送当前在线用户的列表
            ChatQueue.chatClientUser.add(user); //添加到聊天集合
        } else {
            ChatQueue.chatClientQueue.add(user);//添加到队列集合里
            ChatClientServerPool.addUser(user, conn);
            ChatClientServerPool.sendMessageToUser(conn, "当前正忙" + ChatClientServerPool.getOnlineUser().size()); //向当前连接发送当前在线用户的列表
        }
    }

    @Override
    public void onClose(WebSocket webSocket, int i, String s, boolean b) {

    }

    @Override
    public void onMessage(WebSocket webSocket, String s) {
        ChatServerPool.sendMessage(s);
        ChatClientServerPool.sendMessage(s);
    }

    @Override
    public void onError(WebSocket webSocket, Exception e) {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        int port = 8889; //端口
        ChatClient s = new ChatClient(port);
        s.start();
        System.out.println("socketClientServer 已启动，端口：" + s.getPort());
        try {
            String userName = URLEncoder.encode("官方小e（Server）","UTF-8");
            MyWebSocketClient myWebSocketClient = new MyWebSocketClient(new URI("ws://127.0.0.1:"+port+"/?userName="+userName));
            myWebSocketClient.connect();
            MyWebSocketClient.myWebSocketToClient = myWebSocketClient;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
