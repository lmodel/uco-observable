package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A device facet is a grouping of characteristics unique to a piece of equipment or a mechanism designed to serve a special purpose or perform a special function. [based on https://www.merriam-webster.com/dictionary/device]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DeviceFacet extends Facet {

  private Identity manufacturer;
  private String deviceType;
  private String model;
  private String serialNumber;

}