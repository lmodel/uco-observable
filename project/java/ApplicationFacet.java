package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An application facet is a grouping of characteristics unique to a particular software program designed for end users."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ApplicationFacet extends Facet {

  private Integer numberOfLaunches;
  private String applicationIdentifier;
  private List<ApplicationVersion> installedVersionHistory;
  private ObservableObject operatingSystem;
  private String version;

}