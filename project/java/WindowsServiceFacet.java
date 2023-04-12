package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows service facet is a grouping of characteristics unique to a specific Windows service (a computer program that operates in the background of a Windows operating system, similar to the way a UNIX daemon runs on UNIX ). [based on https://en.wikipedia.org/wiki/Windows_service]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsServiceFacet extends Facet {

  private String displayName;
  private String groupName;
  private String serviceName;
  private String servicStatus;
  private String serviceType;
  private String startCommandLine;
  private String startType;
  private List<String> descriptions;

}