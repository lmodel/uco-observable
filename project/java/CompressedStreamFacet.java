package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A compressed stream facet is a grouping of characteristics unique to the application of a size-reduction process to a body of data content."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CompressedStreamFacet extends Facet {

  private BigDecimal compressionRatio;
  private String compressionMethod;

}