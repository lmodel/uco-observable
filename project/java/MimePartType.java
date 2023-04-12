package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A mime part type is a grouping of characteristics unique to a component of a multi-part email body."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class MimePartType extends UcoInherentCharacterizationThing {

  private ObservableObject bodyRaw;
  private String body;
  private String contentDisposition;
  private String contentType;

}