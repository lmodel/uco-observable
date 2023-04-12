package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An environment variable is a grouping of characteristics unique to a dynamic-named value that can affect the way running processes will behave on a computer. [based on https://en.wikipedia.org/wiki/Environment_variable]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class EnvironmentVariable extends UcoInherentCharacterizationThing {

  private String name;
  private String value;

}