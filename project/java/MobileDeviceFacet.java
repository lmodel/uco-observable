package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A mobile device facet is a grouping of characteristics unique to a portable computing device. [based on https://www.lexico.com/definition/mobile_device]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class MobileDeviceFacet extends Facet {

  private boolean mockLocationsAllowed;
  private String clockSetting;
  private String phoneActivationTime;
  private Integer storageCapacityInBytes;
  private String eSN;
  private String iMEI;
  private String bluetoothDeviceName;
  private String keypadUnlockCode;
  private String network;

}