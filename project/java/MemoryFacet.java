package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A memory facet is a grouping of characteristics unique to a particular region of temporary information storage (e.g., RAM (random access memory), ROM (read only memory)) on a digital device."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class MemoryFacet extends Facet {

  private boolean isInjected;
  private boolean isMapped;
  private boolean isProtected;
  private boolean isVolatile;
  private List<String> regionEndAddress;
  private List<String> regionStartAddress;
  private Integer regionSize;
  private String blockType;

}