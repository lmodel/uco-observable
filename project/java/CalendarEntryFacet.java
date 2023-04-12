package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A calendar entry facet is a grouping of characteristics unique to an appointment, meeting, or event within a collection of appointments, meetings, and events."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CalendarEntryFacet extends Facet {

  private ObservableObject application;
  private List<Identity> attendant;
  private boolean isPrivate;
  private String endTime;
  private Location location;
  private String modifiedTime;
  private String observableCreatedTime;
  private UcoObject owner;
  private String remindTime;
  private String startTime;
  private Integer duration;
  private String eventStatus;
  private String eventType;
  private String recurrence;
  private String subject;

}