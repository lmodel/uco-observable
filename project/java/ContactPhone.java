package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A contactPhone is a grouping of characteristics unique to details for contacting a contact entity by telephone."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ContactPhone extends UcoInherentCharacterizationThing {

  private ObservableObject contactPhoneNumber;
  private String contactPhoneScope;

}