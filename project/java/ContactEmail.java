package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A contact email is a grouping of characteristics unique to details for contacting a contact entity by email."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ContactEmail extends UcoInherentCharacterizationThing {

  private ObservableObject emailAddress;
  private String contactEmailScope;

}