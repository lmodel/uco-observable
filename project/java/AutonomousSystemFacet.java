package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An autonomous system facet is a grouping of characteristics unique to a collection of connected Internet Protocol (IP) routing prefixes under the control of one or more network operators on behalf of a single administrative entity or domain that presents a common, clearly defined routing policy to the Internet. [based on https://en.wikipedia.org/wiki/Autonomous_system_(Internet)]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class AutonomousSystemFacet extends Facet {

  private Integer number;
  private String asHandle;
  private String regionalInternetRegistry;

}