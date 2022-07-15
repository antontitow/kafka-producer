package ventus.aura.kafka.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

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

}
