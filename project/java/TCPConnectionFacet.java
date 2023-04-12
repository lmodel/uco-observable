package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A TCP connection facet is a grouping of characteristics unique to portions of a network connection that are conformant to the Transmission Control Protocl (TCP) standard."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class TCPConnectionFacet extends Facet {

  private List<String> sourceFlags;
  private List<String> destinationFlags;

}