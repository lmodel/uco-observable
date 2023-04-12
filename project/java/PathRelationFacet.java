package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A path relation facet is a grouping of characteristics unique to the location of one object within another containing object."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class PathRelationFacet extends Facet {

  private List<String> path;

}