package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A task action type is a grouping of characteristics for a scheduled action to be completed."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class TaskActionType extends UcoInherentCharacterizationThing {

  private IComHandlerActionType iComHandlerAction;
  private IExecActionType iExecAction;
  private IShowMessageActionType iShowMessageAction;
  private ObservableObject iEmailAction;
  private String actionID;
  private String actionType;

}