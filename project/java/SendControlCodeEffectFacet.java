package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A send controlCode effect facet is a grouping of characteristics unique to the effects of actions upon observable objects where a controlCode, or other control-oriented communication signal, is sent to the observable object. An example of this would be an action sending a controlCode changing the running state of a process."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class SendControlCodeEffectFacet extends DefinedEffectFacet {

  private String controlCode;

}