package com.orange.websocket;


import java.util.LinkedList;
import java.util.List;

/**
 * @program: SpringBootDemo
 * @description:
 * @author: chengjiaqi
 * @create: 2019/06/26 11:09
 **/
public class ChatQueue {

    //正在聊天的用户
    public static List<String> chatUser = new LinkedList<String>();



    //排队的聊天用户
    public static List<String> chatQueue = new LinkedList<String>();



    //正在聊天的用户(官方展示socket）
    public static List<String> chatClientUser = new LinkedList<String>();



    //排队的聊天用户(官方展示socket）
    public static List<String> chatClientQueue = new LinkedList<String>();




}
