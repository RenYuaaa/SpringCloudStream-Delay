package com.example.delay.receiver;

import com.example.delay.channel.MQChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import java.util.Date;

/**
 * @author: renjiahui
 * @date: 2021-04-11 22:49
 * @description:
 */
@EnableBinding(MQChannel.MessageSink.class)
public class MsgReceiver {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());


    @StreamListener(MQChannel.INPUT)
    public void reveiver(Object payload) {
        logger.info("延时队列接收到的消息:" + payload + new Date());
    }
}
