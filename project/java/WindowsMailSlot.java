package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows mailslot is is a pseudofile that resides in memory, and may be accessed using standard file functions. The data in a mailslot message can be in any form, but cannot be larger than 424 bytes when sent between computers. Unlike disk files, mailslots are temporary. When all handles to a mailslot are closed, the mailslot and all the data it contains are deleted. [based on https://docs.microsoft.com/en-us/windows/win32/ipc/about-mailslots]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsMailSlot extends ObservableObject {


}