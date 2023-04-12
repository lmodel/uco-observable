package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An Android device facet is a grouping of characteristics unique to an Android device. [based on https://en.wikipedia.org/wiki/Android_(operating_system)]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class AndroidDeviceFacet extends Facet {

  private String androidFingerprint;
  private String androidVersion;
  private String androidID;
  private boolean isADBRootEnabled;
  private boolean isSURootEnabled;

}