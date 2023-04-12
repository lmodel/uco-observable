package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A block device node is a UNIX filesystem special file that serves as a conduit to communicate with devices, providing buffered randomly accesible input and output. Block device nodes are used to apply access rights to the devices and to direct operations on the files to the appropriate device drivers. [based on https://en.wikipedia.org/wiki/Unix_file_types]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class BlockDeviceNode extends FileSystemObject {


}