package ventus.aura.kafka.config;

import lombok.Getter;
import lombok.Setter;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 14.07.2022, 20:26
 */
@Configuration
@ConfigurationProperties(prefix = "ventus.kafka.topic")
@Getter
@Setter
public class TopicConfig {
  private String name;
  private int partition;
  private int replicas;

  @Bean
  public NewTopic topic() {
    return TopicBuilder.name(name).partitions(partition).replicas(replicas).build();
  }
}
