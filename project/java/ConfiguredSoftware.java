package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A configured software is a Software that is known to be configured to run in a more specified manner than some unconfigured or less-configured Software."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ConfiguredSoftware extends Software {

  private Configuration usesConfiguration;
  private UcoObject isConfigurationOf;

}