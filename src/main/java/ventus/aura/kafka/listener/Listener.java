package ventus.aura.kafka.listener;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 12.07.2022, 1:15
 **/
//@EnableKafka
//@Component
public class Listener {

//  @KafkaListener(topics = "msg")
  public void msgListener(String msg) {
    System.out.println(msg);
  }
}
