package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A process thread is the smallest sequence of programmed instructions that can be managed independently by a scheduler on a computer, which is typically a part of the operating system. It is a component of a process. Multiple threads can exist within one process, executing concurrently and sharing resources such as memory, while different processes do not share these resources. In particular, the threads of a process share its executable code and the values of its dynamically allocated variables and non-thread-local global variables at any given time. [based on https://en.wikipedia.org/wiki/Thread_(computing)]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ProcessThread extends ObservableObject {


}