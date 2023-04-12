package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A cell site facet contains the metadata surrounding the cell site."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellSiteFacet extends Facet {

  private String cellSiteCountryCode;
  private String cellSiteIdentifier;
  private String cellSiteLocationAreaCode;
  private String cellSiteNetworkCode;
  private String cellSiteType;

}