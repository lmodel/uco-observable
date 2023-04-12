package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A network connection facet is a grouping of characteristics unique to a connection (complete or attempted) accross a digital network (a group of two or more computer systems linked together). [based on https://www.webopedia.com/TERM/N/network.html]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class NetworkConnectionFacet extends Facet {

  private List<UcoObject> src;
  private List<ObservableObject> dst;
  private ControlledDictionary protocols;
  private boolean isActive;
  private String endTime;
  private String startTime;
  private Integer destinationPort;
  private Integer sourcePort;

}