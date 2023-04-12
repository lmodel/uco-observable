package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A contact list facet is a grouping of characteristics unique to a set of multiple individual contacts such as that found in a digital address book."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ContactListFacet extends Facet {

  private ObservableObject sourceApplication;
  private List<ObservableObject> contact;

}