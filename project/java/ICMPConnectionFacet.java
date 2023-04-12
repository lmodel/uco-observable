package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An ICMP connection facet is a grouping of characteristics unique to portions of a network connection that are conformant to the Internet Control message Protocol (ICMP) standard."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ICMPConnectionFacet extends Facet {

  private List<String> icmpCode;
  private List<String> icmpType;

}