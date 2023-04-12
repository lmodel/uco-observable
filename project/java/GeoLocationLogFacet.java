package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A geolocation log facet is a grouping of characteristics unique to a record containing geolocation tracks and/or geolocation entries."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class GeoLocationLogFacet extends Facet {

  private ObservableObject application;
  private String observableCreatedTime;

}