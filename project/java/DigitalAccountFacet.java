package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A digital account facet is a grouping of characteristics unique to an arrangement with an entity to enable and control the provision of some capability or service within the digital domain."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DigitalAccountFacet extends Facet {

  private boolean isDisabled;
  private String firstLoginTime;
  private String lastLoginTime;
  private String displayName;
  private List<String> accountLogin;

}