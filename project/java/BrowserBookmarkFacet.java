package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A browser bookmark facet is a grouping of characteristics unique to a saved shortcut that directs a WWW (World Wide Web) browser software program to a particular WWW accessible resource. [based on https://techterms.com/definition/bookmark]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class BrowserBookmarkFacet extends Facet {

  private ObservableObject application;
  private String accessedTime;
  private String modifiedTime;
  private String observableCreatedTime;
  private List<String> urlTargeted;
  private Integer visitCount;
  private String bookmarkPath;

}