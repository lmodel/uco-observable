package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows Task facet is a grouping of characteristics unique to a Windows Task (a process that is scheduled to execute on a Windows operating system by the Windows Task Scheduler). [based on http://msdn.microsoft.com/en-us/library/windows/desktop/aa381311(v=vs.85).aspx]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsTaskFacet extends Facet {

  private ObservableObject account;
  private ObservableObject application;
  private ObservableObject workItemData;
  private ObservableObject workingDirectory;
  private List<TaskActionType> actionList;
  private List<String> triggerList;
  private String mostRecentRunTime;
  private String nextRunTime;
  private String observableCreatedTime;
  private Integer exitCode;
  private Integer maxRunTime;
  private String accountLogonType;
  private String accountRunLevel;
  private String imageName;
  private String parameters;
  private String taskComment;
  private String taskCreator;
  private String flags;
  private String priority;
  private String status;

}