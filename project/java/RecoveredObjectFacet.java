package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "Recoverability status of name, metadata, and content."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class RecoveredObjectFacet extends Facet {

  private String contentRecoveredStatus;
  private String metadataRecoveredStatus;
  private String nameRecoveredStatus;

}