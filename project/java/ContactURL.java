package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A contactURL is a grouping of characteristics unique to details for contacting a contact entity by Uniform Resource Locator (URL)."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ContactURL extends UcoInherentCharacterizationThing {

  private String contactURLScope;
  private ObservableObject url;

}