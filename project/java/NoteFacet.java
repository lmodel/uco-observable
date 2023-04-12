package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A note facet is a grouping of characteristics unique to a brief textual record."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class NoteFacet extends Facet {

  private ObservableObject application;
  private String modifiedTime;
  private String observableCreatedTime;
  private String text;

}