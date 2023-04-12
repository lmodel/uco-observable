package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An audio facet is a grouping of characteristics unique to a digital representation of sound."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class AudioFacet extends Facet {

  private Integer bitRate;
  private Integer duration;
  private String audioType;
  private String format;

}