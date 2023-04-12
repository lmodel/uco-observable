package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows registry key facet is a grouping of characteristics unique to a particular key within a Windows registry (A hierarchical database that stores low-level settings for the Microsoft Windows operating sytem and for applications that opt to use the registry). [based on https://en.wikipedia.org/wiki/Windows_Registry]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsRegistrykeyFacet extends Facet {

  private ObservableObject creator;
  private List<WindowsRegistryValue> registryValues;
  private String modifiedTime;
  private Integer numberOfSubkeys;
  private String key;

}