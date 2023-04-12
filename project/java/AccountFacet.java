package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An account facet is a grouping of characteristics unique to an arrangement with an entity to enable and control the provision of some capability or service."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class AccountFacet extends Facet {

  private UcoObject accountIssuer;
  private UcoObject owner;
  private boolean isActive;
  private String expirationDate;
  private String modifiedTime;
  private String observableCreatedTime;
  private String accountIdentifier;
  private String accountType;

}