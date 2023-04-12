package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A fragment facet is a grouping of characteristics unique to an individual piece of the content of a file."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class FragmentFacet extends Facet {

  private List<Integer> fragmentIndex;
  private List<Integer> totalFragments;

}