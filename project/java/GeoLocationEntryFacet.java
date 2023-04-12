package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A geolocation entry facet is a grouping of characteristics unique to a single application-specific geolocation entry."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class GeoLocationEntryFacet extends Facet {

  private Location location;
  private ObservableObject application;
  private String observableCreatedTime;

}