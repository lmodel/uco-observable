package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A properties read effect facet is a grouping of characteristics unique to the effects of actions upon observable objects where a characteristic isRead from an observable object. An example of this would be the current running state of a process."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class PropertyReadEffectFacet extends DefinedEffectFacet {

  private String propertyName;
  private String value;

}