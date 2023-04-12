package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An account authentication facet is a grouping of characteristics unique to the mechanism of accessing an account."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class AccountAuthenticationFacet extends Facet {

  private String passwordLastChanged;
  private String password;
  private String passwordType;

}