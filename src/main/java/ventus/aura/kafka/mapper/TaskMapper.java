package ventus.aura.kafka.mapper;

import org.springframework.stereotype.Component;
import ventus.aura.kafka.model.Task;
import ventus.aura.kafka.model.dto.TaskDto;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 14.07.2022, 16:33
 */
@Component
public interface TaskMapper {

  Task toTask(TaskDto taskDto);
}
