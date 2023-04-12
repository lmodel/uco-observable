package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows hook is a mechanism by which an application can intercept events, such as messages, mouse actions, and keystrokes within the Windows operating system. A function that intercepts a particular type of event is known as a hook procedure. A hook procedure can act on each event it receives, and then modify or discard the event. [based on https://docs.microsoft.com/en-us/windows/win32/winmsg/about-hooks]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsHook extends ObservableObject {


}