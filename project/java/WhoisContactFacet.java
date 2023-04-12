package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Whois contact type is a grouping of characteristics unique to contact-related information present in a response record conformant to the WHOIS protocol standard (RFC 3912). [based on https://en.wikipedia.org/wiki/WHOIS]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WhoisContactFacet extends ContactFacet {

  private String whoisContactType;

}