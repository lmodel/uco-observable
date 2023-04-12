package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows registry value is a grouping of characteristics unique to a particular value within a Windows registry (a hierarchical database that stores low-level settings for the Microsoft Windows operating sytem and for applications that opt to use the registry. [based on https://en.wikipedia.org/wiki/Windows_Registry]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsRegistryValue extends UcoInherentCharacterizationThing {

  private String name;
  private String data;
  private String dataType;

}