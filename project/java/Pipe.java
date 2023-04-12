package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A pipe is a mechanism for one-way inter-process communication using message passing where data written by one process is buffered by the operating system until it isRead by the next process, and this uni-directional channel disappears when the processes are completed. [based on https://en.wikipedia.org/wiki/Pipeline_(Unix) ; https://en.wikipedia.org/wiki/Anonymous_pipe]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Pipe extends ObservableObject {


}