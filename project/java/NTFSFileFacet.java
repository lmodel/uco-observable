package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An NTFS file facet is a grouping of characteristics unique to a file on an NTFS (new technology filesystem) file system."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class NTFSFileFacet extends Facet {

  private List<AlternateDataStream> alternateDataStreams;
  private Integer entryID;
  private String sid;

}