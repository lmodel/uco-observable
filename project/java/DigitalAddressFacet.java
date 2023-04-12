package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A digital address facet is a grouping of characteristics unique to an identifier assigned to enable routing and management of digital communication."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DigitalAddressFacet extends Facet {

  private String addressValue;
  private String displayName;

}