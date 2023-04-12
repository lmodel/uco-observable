package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A domainName facet is a grouping of characteristics unique to an identification string that defines a realm of administrative autonomy, authority or control within the Internet. [based on https://en.wikipedia.org/wiki/Domain_name]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class DomainNameFacet extends Facet {

  private boolean isTLD;
  private String value;

}