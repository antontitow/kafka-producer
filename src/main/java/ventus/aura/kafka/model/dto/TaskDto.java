package ventus.aura.kafka.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import java.util.Date;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 12.07.2022, 1:15
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskDto {
  @NonNull private String title;
  @NonNull private String executor;
  private Date date;
}
