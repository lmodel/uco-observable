package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A UNIX account facet is a grouping of characteristics unique to an account on a UNIX operating system."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class UNIXAccountFacet extends Facet {

  private Integer gid;
  private String shell;

}