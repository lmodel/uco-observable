package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A properties enumerated effect facet is a grouping of characteristics unique to the effects of actions upon observable objects where a characteristic of the observable object is enumerated. An example of this would be startup parameters for a process."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class PropertiesEnumeratedEffectFacet extends DefinedEffectFacet {

  private String properties;

}