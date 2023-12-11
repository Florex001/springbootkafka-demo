package hu.balogh.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicKonfig {

    @Bean
    public NewTopic schoolTopic(){
        return TopicBuilder
                .name("school")
                .build();
    }

}
