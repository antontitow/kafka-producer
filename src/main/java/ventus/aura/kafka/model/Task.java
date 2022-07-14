package ventus.aura.kafka.model;

import lombok.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.io.Serializable;
import java.util.Date;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 14.07.2022, 16:23
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Task extends StringSerializer implements Serializable {
  private static final long serialVersionUID = 12343468885552L;

  private String title;
  private String executor;
  private Date date;
}
