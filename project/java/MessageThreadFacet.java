package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A messageThread facet is a grouping of characteristics unique to a running commentary of electronic messages pertaining to one topic or question."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class MessageThreadFacet extends Facet {

  private Thread messageThreadOrderedItems;
  private Thread messageThreadOriginItems;
  private Thread messageThreadTerminalItems;
  private Thread messageThreadUnorderedItems;
  private List<ObservableObject> participant;
  private Thread messageThread;
  private boolean visibility;

}