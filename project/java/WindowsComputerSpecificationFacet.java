package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows computer specification facet is a grouping of characteristics unique to the hardware and software of a programmable electronic device that can store, retrieve, and process data running a Microsoft Windows operating system. [based on merriam-webster.com/dictionary/computer]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsComputerSpecificationFacet extends Facet {

  private Identity registeredOrganization;
  private Identity registeredOwner;
  private List<GlobalFlagType> globalFlagList;
  private ObservableObject windowsDirectory;
  private ObservableObject windowsSystemDirectory;
  private ObservableObject windowsTempDirectory;
  private String lastShutdownDate;
  private String osInstallDate;
  private String osLastUpgradeDate;
  private String msProductID;
  private String msProductName;
  private String netBIOSName;
  private List<String> domain;

}