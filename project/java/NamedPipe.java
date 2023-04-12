package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A named pipe is a mechanism for FIFO (first-in-first-out) inter-process communication. It is persisted as a filesystem object (that can be deleted like any other file), can be written to or read from by any process and exists beyond the lifespan of any process interacting with it (unlike simple anonymous pipes). [based on https://en.wikipedia.org/wiki/Named_pipe]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class NamedPipe extends FileSystemObject {


}