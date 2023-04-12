package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows Active Directory account facet is a grouping of characteristics unique to an account managed by directory-based identity-related services of a Windows operating system."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsActiveDirectoryAccountFacet extends Facet {

  private String objectGUID;
  private List<String> activeDirectoryGroups;

}