package ventus.aura.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ventus.aura.kafka.mapper.TaskMapperImpl;
import ventus.aura.kafka.producer.Producer;
import ventus.aura.kafkastarter.dto.TaskDto;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 14.07.2022, 17:04
 */
@RestController
@RequestMapping("/task")
public class TaskController {
  private final Producer producer;
  private final TaskMapperImpl taskMapper;

  @Autowired
  public TaskController(Producer producer, TaskMapperImpl taskMapper) {
    this.producer = producer;
    this.taskMapper = taskMapper;
  }

  @PostMapping("/to_check")
  public void sendTask(@RequestBody TaskDto taskDto) {
    producer.sendTask(taskMapper.toTask(taskDto));
  }
}
