package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A user session facet is a grouping of characteristics unique to a temporary and interactive information interchange between two or more communicating devices within the managed scope of a single user. [based on https://en.wikipedia.org/wiki/Session_(computer_science)]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class UserSessionFacet extends Facet {

  private ObservableObject effectiveUser;
  private String loginTime;
  private String logoutTime;
  private String effectiveGroup;
  private String effectiveGroupID;

}