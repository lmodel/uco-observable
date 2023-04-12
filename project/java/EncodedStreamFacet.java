package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An encoded stream facet is a grouping of characteristics unique to the conversion of a body of data content from one form to another form."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class EncodedStreamFacet extends Facet {

  private String encodingMethod;

}