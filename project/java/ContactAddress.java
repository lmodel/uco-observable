package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A contact address is a grouping of characteristics unique to a geolocation address of a contact entity."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ContactAddress extends UcoInherentCharacterizationThing {

  private Location geoLocationAddress;
  private String contactAddressScope;

}