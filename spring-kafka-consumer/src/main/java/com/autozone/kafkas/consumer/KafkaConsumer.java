package com.autozone.kafkas.consumer;

import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.listener.DeadLetterPublishingRecoverer;
import org.springframework.kafka.listener.ErrorHandler;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@EnableKafka
public class KafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = "topic-1", groupId = "group-id", containerFactory = "kafkaListenerContainerFactory")
	public void consume(List<ConsumerRecord<String, String>> consumerRecords, Acknowledgment ack) {
		for (final Object record : consumerRecords) {
			LOGGER.debug(String.format("Message received -> %s", record));
//			Thread.sleep(1000);
		}
	

	}

//	@KafkaListener(topics = "topic-1", groupId = "group-id", containerFactory = "kafkaListenerContainerFactory")
//	public void consume2(List<ConsumerRecord<String, String>> consumerRecords) throws InterruptedException {
//		
//		for (final Object record : consumerRecords) {
//			LOGGER.debug(String.format("Message received -> %s", record));
//			Thread.sleep(1000);
//		  }
//		//LOGGER.debug(String.format("Message received -> %s", consumerRecord.value()));
//	}

}