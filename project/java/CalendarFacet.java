package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A calendar facet is a grouping of characteristics unique to a collection of appointments, meetings, and events."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CalendarFacet extends Facet {

  private UcoObject owner;
  private ObservableObject application;

}