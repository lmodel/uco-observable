package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An encrypted stream facet is a grouping of characteristics unique to the conversion of a body of data content from one form to another obfuscated form in such a way that reversing the conversion to obtain the original data form can only be accomplished through possession and use of a specific key."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class EncryptedStreamFacet extends Facet {

  private String encryptionMethod;
  private String encryptionMode;
  private List<String> encryptionIV;
  private List<String> encryptionKey;

}