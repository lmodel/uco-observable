package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows waitable timer is a synchronization object within the Windows operating system whose state is set to signaled when a specified due time arrives. There are two types of waitable timers that can be created: manual-reset and synchronization. A timer of either type can also be a periodic timer. [based on https://docs.microsoft.com/en-us/windows/win32/sync/waitable-timer-objects]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsWaitableTime extends ObservableObject {


}