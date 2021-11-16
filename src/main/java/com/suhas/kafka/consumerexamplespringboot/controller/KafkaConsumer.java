package com.suhas.kafka.consumerexamplespringboot.controller;

import com.suhas.kafka.consumerexamplespringboot.model.UserData;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics ="kafka-DSL",groupId = "group_id_2",containerFactory = "userDataConcurrentKafkaListenerContainerFactory")
    public void consumeJsonMessage(UserData userData){
        System.out.println("Consumed json messsage of user : "+userData);
    }

}
