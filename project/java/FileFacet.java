package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A file facet is a grouping of characteristics unique to the storage of a file (computer resource for recording data discretely in a computer storage device) on a file system (process that manages how and where data on a storage device is stored, accessed and managed). [based on https://en.wikipedia.org/computer_file and https://www.techopedia.com/definition/5510/file-system]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class FileFacet extends Facet {

  private List<boolean> isDirectory;
  private String accessedTime;
  private String metadataChangeTime;
  private String modifiedTime;
  private String observableCreatedTime;
  private Integer sizeInBytes;
  private String allocationStatus;
  private String extension;
  private List<String> fileName;
  private List<String> filePath;

}