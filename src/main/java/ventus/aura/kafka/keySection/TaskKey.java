package ventus.aura.kafka.keySection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 14.07.2022, 16:29
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TaskKey {
  private String title;
  private String executor;
}
