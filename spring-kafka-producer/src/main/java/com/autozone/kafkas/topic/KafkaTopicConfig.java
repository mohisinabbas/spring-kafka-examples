package com.autozone.kafkas.topic;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.CommonErrorHandler;
import org.springframework.kafka.listener.DeadLetterPublishingRecoverer;
import org.springframework.kafka.listener.DefaultErrorHandler;
import org.springframework.util.backoff.FixedBackOff;

@Configuration
public class KafkaTopicConfig {
	
//	 @Bean("kafkaListenerContainerFactory")
//	 public ConcurrentKafkaListenerContainerFactory<Object, Object> kafkaListenerContainerFactory() {
//	        ConcurrentKafkaListenerContainerFactory<Object, Object> concurrentKafkaListenerContainerFactory
//	                = new ConcurrentKafkaListenerContainerFactory<>();
//	        concurrentKafkaListenerContainerFactory.setConsumerFactory(new DefaultKafkaConsumerFactory<K, V>(kafkaProps.consumerProps()));
//	        DeadLetterPublishingRecoverer deadLetterPublishingRecoverer =
//	            new DeadLetterPublishingRecoverer(kafkaTemplate, (record, ex) -> {
//	                log.info("Exception {} occurred sending the record to the error topic {}", ex.getMessage(), deadLetterTopic);
//	                return new TopicPartition(deadLetterTopic, -1);
//	            });
//	        CommonErrorHandler errorHandler = new DefaultErrorHandler(deadLetterPublishingRecoverer, new FixedBackOff(0L, 1L));
//	        concurrentKafkaListenerContainerFactory.setCommonErrorHandler(errorHandler);
//	        return concurrentKafkaListenerContainerFactory;
//	    }

//    @Bean
//    public NewTopic javaguidesTopic(){
//        return TopicBuilder.name("test-topic")
//                .build();
//    }
    
//    @Bean
//    public NewTopic deadLetterTopic(AppKafkaProperties properties) {
//      // https://docs.spring.io/spring-kafka/docs/2.8.2/reference/html/#configuring-topics
//      return TopicBuilder.name("new-abbas-test" + properties.deadletter().suffix()).partitions(1)
//        .config(TopicConfig.RETENTION_MS_CONFIG, "" + properties.deadletter().retention().toMillis())
//        .build();
//    }
}