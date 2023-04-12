package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A volume facet is a grouping of characteristics unique to a single accessible storage area (volume) with a single file system. [based on https://en.wikipedia.org/wiki/volume_(computing)]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class VolumeFacet extends Facet {

  private Integer sectorSize;
  private String volumeID;

}