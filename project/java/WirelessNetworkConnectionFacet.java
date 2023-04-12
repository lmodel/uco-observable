package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A wireless network connection facet is a grouping of characteristics unique to a connection (completed or attempted) across an IEEE 802.11 standards-conformant digital network (a group of two or more computer systems linked together). [based on https://www.webopedia.com/TERM/N/network.html]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WirelessNetworkConnectionFacet extends Facet {

  private String baseStation;
  private String password;
  private String ssid;
  private String wirelessNetworkSecurityMode;

}