package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A computer specificaiton facet is a grouping of characteristics unique to the hardware and software of a programmable electronic device that can store, retrieve, and process data. [based on merriam-webster.com/dictionary/computer]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ComputerSpecificationFacet extends Facet {

  private String biosDate;
  private String biosReleaseDate;
  private String currentSystemDate;
  private String localTime;
  private String systemTime;
  private Integer availableRam;
  private Integer totalRam;
  private String biosManufacturer;
  private String biosSerialNumber;
  private String biosVersion;
  private String cpu;
  private String cpuFamily;
  private String gpu;
  private String gpuFamily;
  private String hostname;
  private List<ObservableObject> networkInterface;
  private String processorArchitecture;
  private String timezoneDST;
  private String timezoneStandard;
  private String uptime;

}