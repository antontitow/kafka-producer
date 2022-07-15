package ventus.aura.kafka.producer.transfer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;
import ventus.aura.kafkastarter.Task;

import java.util.Map;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 14.07.2022, 20:11
 */
public class TaskSerializer implements Serializer<Task> {

  private final ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {}

  @Override
  public void close() {}

  @Override
  public byte[] serialize(String topic, Task data) {
    try {
      if (data == null) {
        return null;
      }
      return objectMapper.writeValueAsBytes(data);
    } catch (Exception e) {
      throw new SerializationException("Error when serializing Task to byte[]");
    }
  }
}
