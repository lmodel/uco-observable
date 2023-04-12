package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  'A globalFlagType is a grouping of characteristics unique to the Windows systemwide global variable named NtGlobalFlag that enables various internal debugging, tracing, and validation support in the operating system. [based on "Windows Global Flags, Chapter 3: System Mechanisms of Windows Internals by Solomon, Russinovich, and Ionescu]'
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class GlobalFlagType extends UcoInherentCharacterizationThing {

  private List<String> hexadecimalValue;
  private String abbreviation;
  private String destination;
  private String symbolicName;

}