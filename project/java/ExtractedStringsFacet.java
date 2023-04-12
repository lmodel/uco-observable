package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An extracted strings facet is a grouping of characteristics unique to one or more sequences of characters pulled from an observable object."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ExtractedStringsFacet extends Facet {

  private List<ExtractedString> strings;

}