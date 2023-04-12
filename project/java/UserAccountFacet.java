package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A user account facet is a grouping of characteristics unique to an account controlling a user's access to a network, system, or platform."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class UserAccountFacet extends Facet {

  private boolean canEscalatePrivs;
  private boolean isPrivileged;
  private boolean isServiceAccount;
  private String homeDirectory;

}