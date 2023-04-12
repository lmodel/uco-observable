package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A file permissions facet is a grouping of characteristics unique to the access rights (e.g., view, change, navigate, execute) of a file on a file system."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class FilePermissionsFacet extends Facet {

  private UcoObject owner;

}