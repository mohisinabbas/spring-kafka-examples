package com.autozone.kafkas.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

@Service
public class KafkaProducerJava {

	
    private static final Logger logger = LoggerFactory.getLogger(KafkaProducerJava.class);
    private static final String TOPIC = "test-topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
//
//    public void sendMessage(String message) {
//        
//        
//        for(int i=0;i<Integer.valueOf(message);i++) {
//        	logger.info(String.format("Producing message -> %s", "Hello Autozone"+message));
//        	this.kafkaTemplate.send(TOPIC, "Hello Autozone" + i);
//        }     
//    }
}
