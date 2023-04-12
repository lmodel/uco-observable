package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An image facet is a grouping of characteristics unique to a complete copy of a hard disk, memory, or other digital media."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ImageFacet extends Facet {

  private String imageType;

}