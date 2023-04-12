package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows PE binary file facet is a grouping of characteristics unique to a Windows portable executable (PE) file."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsPEBinaryFileFacet extends Facet {

  private WindowsPEOptionalHeader optionalHeader;
  private List<WindowsPESection> sections;
  private List<Hash> fileHeaderHashes;
  private String timeDateStamp;
  private List<String> pointerToSymbolTable;
  private Integer numberOfSections;
  private Integer numberOfSymbols;
  private Integer sizeOfOptionalHeader;
  private String impHash;
  private String peType;
  private List<String> machine;
  private List<String> characteristics;

}