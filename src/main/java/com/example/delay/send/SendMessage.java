package com.example.delay.send;

import com.example.delay.channel.MQChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: renjiahui
 * @date: 2021-04-11 23:01
 * @description:
 */
@Component
@EnableBinding(MQChannel.MessageSource.class)
public class SendMessage {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MQChannel.MessageSource messageSource;

    public void sendMessage() {
        logger.info("延时队列发送的消息: " + new Date());
        messageSource.output().send(MessageBuilder.withPayload("hello").setHeader("x-delay", 5000).build());
    }
}
