package ventus.aura.kafka.mapper;

import org.springframework.stereotype.Component;
import ventus.aura.kafka.keySection.TaskKey;
import ventus.aura.kafkastarter.Task;
import ventus.aura.kafkastarter.dto.TaskDto;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 14.07.2022, 19:10
 */
@Component
public class TaskMapperImpl implements TaskMapper {
  @Override
  public Task toTask(TaskDto taskDto) {
    return new Task(taskDto.getTitle(), taskDto.getExecutor(), taskDto.getDate());
  }

  @Override
  public TaskKey toTaskKey(Task task) {
    return new TaskKey(task.getTitle(), task.getExecutor());
  }
}
