package com.example.delay.controller;

import com.example.delay.send.SendMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: renjiahui
 * @date: 2021-04-11 22:53
 * @description:
 */
@RestController
public class SendController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SendMessage sendMessage;

    @GetMapping("/hello")
    public void sendMessage() {
        sendMessage.sendMessage();
    }
}
