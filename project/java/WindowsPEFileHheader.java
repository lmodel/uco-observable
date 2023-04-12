package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows PE file header is a grouping of characteristics unique to the 'header' of a Windows PE (Portable Executable) file, consisting of a collection of metadata about the overall nature and structure of the file."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsPEFileHheader extends UcoInherentCharacterizationThing {

  private String timeDateStamp;

}