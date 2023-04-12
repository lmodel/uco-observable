package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A data range facet is a grouping of characteristics unique to a particular contiguous scope within a block of digital data."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DataRangeFacet extends Facet {

  private Integer rangeOffset;
  private Integer rangeSize;
  private String rangeOffsetType;

}