package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A character device node is a UNIX filesystem special file that serves as a conduit to communicate with devices, providing only a serial stream of input or accepting a serial stream of output. Character device nodes are used to apply access rights to the devices and to direct operations on the files to the appropriate device drivers. [based on https://en.wikipedia.org/wiki/Unix_file_types]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CharacterDeviceNode extends FileSystemObject {


}