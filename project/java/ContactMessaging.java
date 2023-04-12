package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A contactMessaging is a grouping of characteristics unique to details for contacting a contact entity by digital messaging."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ContactMessaging extends UcoInherentCharacterizationThing {

  private ObservableObject contactMessagingPlatform;
  private ObservableObject messagingAddress;

}