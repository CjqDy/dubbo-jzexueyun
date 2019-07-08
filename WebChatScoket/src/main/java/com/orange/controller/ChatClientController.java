package com.orange.controller;

import com.orange.util.RequestMsg;
import com.orange.util.ResponseMsg;
import com.orange.websocket.MyWebSocketClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: WebChatScoket
 * @description:
 * @author: chengjiaqi
 * @create: 2019/06/27 10:02
 **/
@RestController
@RequestMapping("/ChatClient")
public class ChatClientController {


    @ResponseBody
    @RequestMapping(value = "/sendMessage",method = RequestMethod.POST)
    public ResponseMsg sendMessage(@RequestBody RequestMsg requestMsg){
        System.out.println("12344");
        MyWebSocketClient.myWebSocketClient.send("123");
        return null;
    }


}
