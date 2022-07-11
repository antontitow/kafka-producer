package ventus.aura.kafka.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 12.07.2022, 1:15
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DtoRq {
  private String msgId;
  private String msg;
}
