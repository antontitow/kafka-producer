package ventus.aura.kafka.mapper;

import org.springframework.stereotype.Component;
import ventus.aura.kafka.model.Task;
import ventus.aura.kafka.model.dto.TaskDto;

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
}
