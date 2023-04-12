package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows process facet is a grouping of characteristics unique to a program running on a Windows operating system."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsProcessFacet extends Facet {

  private Dictionary startupInfo;
  private boolean aslrEnabled;
  private boolean depEnabled;
  private String ownerSID;
  private String priority;
  private String windowTitle;

}