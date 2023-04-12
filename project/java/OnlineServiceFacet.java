package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An online service facet is a grouping of characteristics unique to a particular provision mechanism of information access, distribution or manipulation over the Internet"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class OnlineServiceFacet extends Facet {

  private Location location;
  private ObservableObject inetLocation;
  private String name;

}