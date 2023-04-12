package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An operating system facet is a grouping of characteristics unique to the software that manages computer hardware, software resources, and provides common services for computer programs. [based on https://en.wikipedia.org/wiki/Operating_system]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class OperatingSystemFacet extends Facet {

  private Identity manufacturer;
  private Dictionary environmentVariables;
  private boolean isLimitAdTrackingEnabled;
  private String installDate;
  private String bitness;
  private String version;
  private List<String> advertisingID;

}