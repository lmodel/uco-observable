package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows PE section is a grouping of characteristics unique to a specific default or custom-defined region of a Windows PE (Portable Executable) file, consisting of an individual portion of the actual executable content of the file delineated according to unique purpose and memory protection requirements."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsPESection extends UcoInherentCharacterizationThing {

  private List<Hash> hashes;
  private BigDecimal entropy;
  private String size;
  private String name;

}