package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows PE optional header is a grouping of characteristics unique to the 'optionalHeader' of a Windows PE (Portable Executable) file, consisting of a collection of metadata about the executable code structure of the file."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsPEOptionalHeader extends UcoInherentCharacterizationThing {

  private List<String> majorLinkerVersion;
  private List<String> minorLinkerVersion;
  private List<String> addressOfEntryPoint;
  private List<String> baseOfCode;
  private List<String> checksum;
  private List<String> fileAlignment;
  private List<String> imageBase;
  private List<String> loaderFlags;
  private List<String> numberOfRVAAndSizes;
  private List<String> sectionAlignment;
  private List<String> sizeOfCode;
  private List<String> sizeOfHeaders;
  private List<String> sizeOfHeapCommit;
  private List<String> sizeOfHeapReserve;
  private List<String> sizeOfImage;
  private List<String> sizeOfInitializedData;
  private List<String> sizeOfStackCommit;
  private List<String> sizeOfStackReserve;
  private List<String> sizeOfUninitializedData;
  private List<String> win32VersionValue;
  private List<String> dllCharacteristics;
  private List<String> magic;
  private List<String> majorImageVersion;
  private List<String> majorOSVersion;
  private List<String> majorSubsystemVersion;
  private List<String> minorImageVersion;
  private List<String> minorOSVersion;
  private List<String> minorSubsystemVersion;
  private List<String> subsystem;

}