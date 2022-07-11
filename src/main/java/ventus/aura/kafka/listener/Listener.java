package ventus.aura.kafka.listener;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 12.07.2022, 1:15
 */
@EnableKafka
@Component
public class Listener {
  @KafkaListener(topics = "nero2")
  public void msgListener2(@Payload(required = false) String msg) {
    System.out.println(msg+"dd");
  }
}
