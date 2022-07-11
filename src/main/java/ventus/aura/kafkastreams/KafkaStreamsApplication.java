package ventus.aura.kafkastreams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import ventus.aura.kafkastreams.config.KafkaConfig;

@SpringBootApplication
@EnableKafka
public class KafkaStreamsApplication {
  private final KafkaConfig kafkaConfig;

  @Autowired
  public KafkaStreamsApplication(KafkaConfig kafkaConfig) {
    this.kafkaConfig = kafkaConfig;
  }

  @KafkaListener(topics = "nero2")
  public void msgListener(@Payload(required = false) String msg) {
    System.out.println(msg);
  }

  public static void main(String[] args) {
    SpringApplication.run(KafkaStreamsApplication.class, args);
  }
}
