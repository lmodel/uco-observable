package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A URL history facet is a grouping of characteristics unique to the stored URL history for a particular web browser"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class URLHistoryFacet extends Facet {

  private ObservableObject browserInformation;
  private List<URLHistoryEntry> urlHistoryEntry;

}