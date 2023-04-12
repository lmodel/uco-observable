package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A digital signature info facet is a grouping of characteristics unique to a value calculated via a mathematical scheme for demonstrating the authenticity of an electronic message or document."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DigitalSignatureInfoFacet extends Facet {

  private UcoObject certificateSubject;
  private Identity certificateIssuer;
  private boolean signatureExists;
  private boolean signatureVerified;
  private String signatureDescription;

}