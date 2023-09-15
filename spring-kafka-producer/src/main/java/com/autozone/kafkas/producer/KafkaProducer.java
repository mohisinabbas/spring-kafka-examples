package com.autozone.kafkas.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class KafkaProducer {

	
    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
    private static final String TOPIC = "topic-1";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
    //@Transactional
    public void sendMessage(String message) throws InterruptedException {
        for(int i=0;i<Integer.valueOf(message);i++) {
        	logger.debug(String.format("Producing message -> %s", "Hello Autozone"+i));
        	this.kafkaTemplate.send(TOPIC, "key1", "Hello Autozone" + i);
        	//Thread.sleep(1000);
        }     
    }
}
