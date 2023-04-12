package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An IShow message action type is a grouping of characteristics unique to an action that shows a message box when a task is activate. [based on https://docs.microsoft.com/en-us/windows/win32/api/taskschd/nn-taskschd-ishowmessageaction?redirectedfrom=MSDN]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class IShowMessageActionType extends UcoInherentCharacterizationThing {

  private String showMessageBody;
  private String showMessageTitle;

}