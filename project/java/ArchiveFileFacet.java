package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An archive file facet is a grouping of characteristics unique to a file that is composed of one or more computer files along with metadata."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ArchiveFileFacet extends Facet {

  private String archiveType;
  private String comment;
  private String version;

}