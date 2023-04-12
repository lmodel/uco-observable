package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows thread facet is a grouping os characteristics unique to a single thread of execution within a Windows process."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsThreadFacet extends Facet {

  private String creationTime;
  private List<String> parameterAddress;
  private List<String> startAddress;
  private String priority;
  private List<String> stackSize;
  private List<String> threadID;
  private String context;
  private String runningStatus;
  private String securityAttributes;
  private List<String> creationFlags;

}