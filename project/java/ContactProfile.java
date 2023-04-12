package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A contactProfile is a grouping of characteristics unique to details for contacting a contact entity by online service."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ContactProfile extends UcoInherentCharacterizationThing {

  private ObservableObject contactProfilePlatform;
  private ObservableObject profile;

}