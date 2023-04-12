package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A state change effect facet is a grouping of characteristics unique to the effects of actions upon observable objects where a state of the observable object is changed."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class StateChangeEffectFacet extends DefinedEffectFacet {

  private ObservableObject newObject;
  private ObservableObject oldObject;

}