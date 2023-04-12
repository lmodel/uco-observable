package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A phone account facet is a grouping of characteristics unique to an arrangement with an entity to enable and control the provision of a telephony capability or service."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class PhoneAccountFacet extends Facet {

  private String phoneNumber;

}