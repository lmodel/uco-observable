package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An IExec action type is a grouping of characteristics unique to an action that executes a command-line operation on a Windows operating system. [based on https://docs.microsoft.com/en-us/windows/win32/api/taskschd/nn-taskschd-iexecaction?redirectedfrom=MSDN]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class IExecActionType extends UcoInherentCharacterizationThing {

  private List<Hash> execProgramHashes;
  private String execArguments;
  private String execProgramPath;
  private String execWorkingDirectory;

}