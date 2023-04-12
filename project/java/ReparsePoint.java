package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A reparse point is a type of NTFS (New Technology file System) object which is an optional attribute of files and directories meant to define some sort of preprocessing before accessing the said file or directory. For instance reparse points can be used to redirect access to files which have been moved to long term storage so that some application would retrieve them and make them directly accessible. A reparse point contains a reparse tag and data that are interpreted by a filesystem filter identified by the tag. [based on https://jp-andre.pagesperso-orange.fr/junctions.html ; https://en.wikipedia.org/wiki/NTFS_reparse_point]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ReparsePoint extends FileSystemObject {


}