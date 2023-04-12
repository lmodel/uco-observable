package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Whois registrarInfo type is a grouping of characteristics unique to registrar-related information present in a response record conformant to the WHOIS protocol standard (RFC 3912). [based on https://en.wikipedia.org/wiki/WHOIS]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WhoisRegistrarInfoType extends UcoInherentCharacterizationThing {

  private Location geoLocationAddress;
  private ObservableObject contactPhoneNumber;
  private ObservableObject emailAddress;
  private ObservableObject referralURL;
  private ObservableObject whoisServer;
  private String registrarGUID;
  private String registrarID;
  private String registrarName;

}