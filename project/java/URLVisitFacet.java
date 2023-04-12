package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A URL visit facet is a grouping of characteristics unique to the properties of a visit of a URL within a particular browser."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class URLVisitFacet extends Facet {

  private ObservableObject browserInformation;
  private ObservableObject fromURLVisit;
  private ObservableObject url;
  private String visitTime;
  private String visitDuration;
  private String urlTransitionType;

}