package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A networkInterface facet is a grouping of characteristics unique to a software or hardware interface between two pieces of equipment or protocol layers in a computer network."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class NetworkInterfaceFacet extends Facet {

  private ObservableObject macAddress;
  private List<ObservableObject> dhcpServer;
  private List<ObservableObject> ip;
  private List<ObservableObject> ipGateway;
  private String dhcpLeaseExpires;
  private String dhcpLeaseObtained;
  private String adapterName;

}