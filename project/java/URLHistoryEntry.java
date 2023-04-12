package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A URL history entry is a grouping of characteristics unique to the properties of a single URL history entry for a particular browser"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class URLHistoryEntry extends UcoInherentCharacterizationThing {

  private ObservableObject url;
  private ObservableObject referrerURL;
  private String expirationTime;
  private String firstVisit;
  private String lastVisit;
  private Integer visitCount;
  private String manuallyEnteredCount;
  private String browserUserProfile;
  private String hostname;
  private String pageTitle;
  private String keywordSearchTerm;

}