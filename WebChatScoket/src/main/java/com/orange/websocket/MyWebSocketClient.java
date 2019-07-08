package com.orange.websocket;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.Iterator;

/**
 * @program: SpringBootDemo
 * @description: MyWebSocketClient
 * @author: chengjiaqi
 * @create: 2019/06/26 17:55
 **/

public class MyWebSocketClient extends WebSocketClient {

    public static MyWebSocketClient myWebSocketClient;

    public static MyWebSocketClient myWebSocketToClient;


    public MyWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        System.out.println("握手...");
    }

    @Override
    public void onMessage(String s) {
        System.out.println("消息："+s);
    }

    @Override
    public void onClose(int i, String s, boolean b) {

    }

    @Override
    public void onError(Exception e) {

    }
}
