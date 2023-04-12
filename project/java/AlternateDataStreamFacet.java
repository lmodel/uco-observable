package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An alternate data stream facet is a grouping of characteristics unique to data content stored within an NTFS file that is independent of the standard content stream of the file and isHidden from access by default NTFS file viewing mechanisms."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class AlternateDataStreamFacet extends Facet {

  private Hash hashes;
  private String name;
  private String size;

}