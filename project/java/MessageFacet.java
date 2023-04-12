package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A message facet is a grouping of characteristics unique to a discrete unit of electronic communication intended by the source for consumption by some recipient or group of recipients. [based on https://en.wikipedia.org/wiki/message]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class MessageFacet extends Facet {

  private ObservableObject application;
  private List<ObservableObject> from;
  private List<ObservableObject> to;
  private String sentTime;
  private String messageID;
  private String messageText;
  private String messageType;
  private String sessionID;

}