package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An event record facet is a grouping of characteristics unique to something that happens in a digital context (e.g., operating system events)."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class EventRecordFacet extends Facet {

  private ObservableAction cyberAction;
  private ObservableObject account;
  private ObservableObject application;
  private ObservableObject eventRecordDevice;
  private String observableCreatedTime;
  private String endTime;
  private String startTime;
  private String eventID;
  private String eventRecordID;
  private String eventRecordRaw;
  private String eventRecordServiceName;
  private String eventRecordText;
  private String eventType;

}