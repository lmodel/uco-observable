package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A UNIX process facet is a grouping of characteristics unique to an instance of a computer program executed on a UNIX operating system."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class UNIXProcessFacet extends Facet {

  private List<Integer> openFileDescriptor;
  private List<String> ruid;

}