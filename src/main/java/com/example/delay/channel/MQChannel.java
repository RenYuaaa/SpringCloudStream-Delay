package com.example.delay.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author: renjiahui
 * @date: 2021-04-11 22:44
 * @description:
 */
public class MQChannel {

    public static final String INPUT = "delay-input";
    public static final String OUTPUT = "delay-output";

    public interface MessageSource {

        @Output(OUTPUT)
        MessageChannel output();

    }

    public interface MessageSink {

        @Input(INPUT)
        SubscribableChannel input();

    }

}
