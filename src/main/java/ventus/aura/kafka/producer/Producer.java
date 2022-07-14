package ventus.aura.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ventus.aura.kafka.config.TopicConfig;
import ventus.aura.kafka.model.Task;

/**
 * @autor : {@literal }
 * @created : 11.07.2022, 2:39
 */
@Service
@Slf4j
public class Producer {
  private final KafkaTemplate<String, Task> kafkaTemplate;
  private final TopicConfig topicConfig;

  @Autowired
  public Producer(KafkaTemplate<String, Task> kafkaTemplate, TopicConfig topicConfig) {
    this.kafkaTemplate = kafkaTemplate;
    this.topicConfig = topicConfig;
  }

  public void sendTask(Task task) {
    log.info("Send task to topic \"" + topicConfig.getName() + "\";");
    this.kafkaTemplate.send(topicConfig.getName(), task);
  }
}
