package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An observable object is a grouping of characteristics unique to a distinct article or unit within the digital domain."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ObservableObject extends CoItem {

  private boolean hasChanged;
  private String state;
  private String createdBy;
  private List<String> description;
  private List<String> externalReference;
  private List<String> hasFacet;
  private List<String> modifiedTime;
  private String name;
  private List<MarkingDefinitionAbstraction> objectMarking;
  private String objectCreatedTime;
  private String specVersion;
  private List<String> tag;

}