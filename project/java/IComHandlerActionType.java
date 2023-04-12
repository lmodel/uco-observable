package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An IComHandler action type is a grouping of characteristics unique to a Windows Task-related action that fires a Windows COM handler (smart code in the client address space that can optimize calls between a client and server). [based on https://docs.microsoft.com/en-us/windows/win32/taskschd/comhandleraction]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class IComHandlerActionType extends UcoInherentCharacterizationThing {

  private String comClassID;
  private String comData;

}