package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A disk partition facet is a grouping of characteristics unique to a particular managed region on a storage mechanism."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DiskPartitionFacet extends Facet {

  private String observableCreatedTime;
  private Integer partitionLength;
  private Integer partitionOffset;
  private Integer spaceLeft;
  private Integer spaceUsed;
  private Integer totalSpace;
  private String diskPartitionType;
  private String mountPoint;
  private String partitionID;

}