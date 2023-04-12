package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A call facet is a grouping of characteristics unique to a connection as part of a realtime cyber communication between one or more parties."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CallFacet extends Facet {

  private ObservableObject application;
  private String endTime;
  private String startTime;
  private Integer duration;
  private List<ObservableObject> participant;
  private String callType;
  private ObservableObject from;
  private List<ObservableObject> to;

}