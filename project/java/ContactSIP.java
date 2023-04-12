package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A contactSIP is a grouping of characteristics unique to details for contacting a contact entity by Session Initiation Protocol (SIP)."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ContactSIP extends UcoInherentCharacterizationThing {

  private ObservableObject sipAddress;
  private String contactSIPScope;

}