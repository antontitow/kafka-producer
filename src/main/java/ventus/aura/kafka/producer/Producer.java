package ventus.aura.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import ventus.aura.kafka.config.KafkaConfig;
import ventus.aura.kafka.dto.DtoRq;

/**
 * @autor : {@literal }
 * @created : 11.07.2022, 2:39
 */
@RestController
@RequestMapping("/msg")
public class Producer {
  private static final Logger logger = LoggerFactory.getLogger(Producer.class);
  private final KafkaTemplate<String, String> kafkaTemplate;
  private final KafkaConfig kafkaConfig;

  @Autowired
  public Producer(KafkaTemplate<String, String> kafkaTemplate, KafkaConfig kafkaConfig) {
    this.kafkaTemplate = kafkaTemplate;
    this.kafkaConfig = kafkaConfig;
  }

  @PostMapping("/kafka")
  public void sendOrder(@RequestBody DtoRq dtoRq) {
    System.out.println("Send data to topic " + kafkaConfig.getName());
    kafkaTemplate.send(kafkaConfig.getName(), dtoRq.getMsg());
  }
}
