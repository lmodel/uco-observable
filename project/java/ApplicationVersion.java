package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An application version is a grouping of characteristics unique to a particular software program version."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ApplicationVersion extends UcoInherentCharacterizationThing {

  private String installDate;
  private String uninstallDate;
  private String version;

}