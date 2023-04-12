package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An email account facet is a grouping of characteristics unique to an arrangement with an entity to enable and control the provision of electronic mail (email) capabilities or services."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class EmailAccountFacet extends Facet {

  private ObservableObject emailAddress;

}