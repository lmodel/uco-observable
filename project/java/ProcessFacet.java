package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A process facet is a grouping of characteristics unique to an instance of a computer program executed on an operating system."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ProcessFacet extends Facet {

  private ObservableObject binary;
  private ObservableObject creatorUser;
  private ObservableObject parent;
  private Dictionary environmentVariables;
  private boolean isHidden;
  private String exitTime;
  private String observableCreatedTime;
  private Integer exitStatus;
  private Integer pid;
  private String currentWorkingDirectory;
  private String status;
  private List<String> arguments;

}