package hu.balogh.kafka.consumer;

import hu.balogh.kafka.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "school", groupId = "myGroup")
    public void consumeMsg(String msg){
        log.info(format("Üzenet a School topicban:: %s", msg));
    }

    @KafkaListener(topics = "school", groupId = "myGroup")
    public void consumeMsg(Student student){
        log.info(format("Üzenet a School topicban:: %s", student.toString()));
    }

}
