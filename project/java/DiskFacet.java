package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A disk facet is a grouping of characteristics unique to a storage mechanism where data is recorded by various electronic, magnetic, optical, or mechanical changes to a surface layer of one or more rotating disks."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DiskFacet extends Facet {

  private List<ObservableObject> partition;
  private Integer diskSize;
  private Integer freeSpace;
  private String diskType;

}