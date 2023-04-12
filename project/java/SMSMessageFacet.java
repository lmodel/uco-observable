package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A SMS message facet is a grouping of characteristics unique to a message conformant to the short message service (SMS) communication protocol standards."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class SMSMessageFacet extends Facet {

  private boolean isRead;

}