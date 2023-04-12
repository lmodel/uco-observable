package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows registry hive facet is a grouping of characteristics unique to a particular logical group of keys, subkeys, and values in a Windows registry (a hierarchical database that stores low-level settings for the Microsoft Windows operating sytem and for applications that opt to use the registry). [based on https://en.wikipedia.org/wiki/Windows_Registry]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsRegistryHiveFacet extends Facet {

  private String hiveType;

}