package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A triggerType is a grouping of characterizes unique to a set of criteria that, when met, starts the execution of a task within a Windows operating system. [based on https://docs.microsoft.com/en-us/windows/win32/taskschd/task-triggers]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class TriggerType extends UcoInherentCharacterizationThing {

  private boolean isEnabled;
  private String triggerBeginTime;
  private String triggerEndTime;
  private String triggerDelay;
  private String triggerMaxRunTime;
  private String triggerSessionChangeType;
  private String triggerFrequency;
  private String triggerType;

}