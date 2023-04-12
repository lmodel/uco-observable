package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows account facet is a grouping of characteristics unique to a user account on a Windows operating system."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsAccountFacet extends Facet {

  private List<String> groups;

}