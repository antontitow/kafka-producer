package ventus.aura.kafka.config;

import org.apache.kafka.clients.producer.internals.DefaultPartitioner;
import org.apache.kafka.common.Cluster;
import org.springframework.beans.factory.annotation.Autowired;
import ventus.aura.kafka.keySection.TaskKey;
import ventus.aura.kafka.mapper.TaskMapper;
import ventus.aura.kafkastarter.Task;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 14.07.2022, 16:18
 */
public class Partitioner extends DefaultPartitioner {
  // todo
  private final TaskMapper taskMapper;

  @Autowired
  public Partitioner(TaskMapper taskMapper) {
    this.taskMapper = taskMapper;
  }

  @Override
  public int partition(
      String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
    Object newKey = null;
    if (key != null) {
      Task task = (Task) key;
      TaskKey taskKey = taskMapper.toTaskKey(task);
      newKey = taskKey.getTitle() + taskKey.getExecutor();
      keyBytes = (taskKey.getTitle() + taskKey.getExecutor()).getBytes();
    }

    return super.partition(topic, newKey, keyBytes, value, valueBytes, cluster);
  }
}
