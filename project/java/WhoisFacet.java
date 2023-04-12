package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Whois facet is a grouping of characteristics unique to a response record conformant to the WHOIS protocol standard (RFC 3912). [based on https://en.wikipedia.org/wiki/WHOIS]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WhoisFacet extends Facet {

  private ObservableObject domainName;
  private ObservableObject ipAddress;
  private ObservableObject registrantContactInfo;
  private ObservableObject serverName;
  private List<ObservableObject> nameServer;
  private WhoisRegistrarInfoType registrarInfo;
  private String creationDate;
  private String expirationDate;
  private String lookupDate;
  private String updatedDate;
  private String domainID;
  private String remarks;
  private String sponsoringRegistrar;
  private List<String> registrantIDs;
  private String dnssec;
  private String status;
  private String regionalInternetRegistry;

}