package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A values enumerated effect facet is a grouping of characteristics unique to the effects of actions upon observable objects where a value of the observable object is enumerated. An example of this would be the values of a registry key."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ValuesEnumeratedEffectFacet extends DefinedEffectFacet {

  private String values;

}