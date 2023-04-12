package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An extracted string is a grouping of characteristics unique to a series of characters pulled from an observable object."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ExtractedString extends UcoInherentCharacterizationThing {

  private Integer length;
  private String byteStringValue;
  private String encoding;
  private String englishTranslation;
  private String language;
  private String stringValue;

}