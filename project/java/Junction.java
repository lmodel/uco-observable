package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A junction is a specific NTFS (New Technology file System) reparse point to redirect a directory access to another directory which can be on the same volume or another volume. A junction is similar to a directory symbolic link but may differ on whether they are processed on the local system or on the remote file server. [based on https://jp-andre.pagesperso-orange.fr/junctions.html]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Junction extends FileSystemObject {


}