package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A file system facet is a grouping of characteristics unique to the process that manages how and where data on a storage medium is stored, accessed and managed. [based on https://www.techopedia.com/definition/5510/file-system]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class FileSystemFacet extends Facet {

  private Integer clusterSize;
  private String fileSystemType;

}