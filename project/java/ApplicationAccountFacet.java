package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An application account facet is a grouping of characteristics unique to an account within a particular software program designed for end users."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ApplicationAccountFacet extends Facet {

  private ObservableObject application;

}