package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows volume facet is a grouping of characteristics unique to a single accessible storage area (volume) with a single windows file system. [based on https://en.wikipedia.org/wiki/volume_(computing)]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsVolumeFacet extends Facet {

  private String driveLetter;
  private String driveType;
  private String windowsVolumeAttributes;

}