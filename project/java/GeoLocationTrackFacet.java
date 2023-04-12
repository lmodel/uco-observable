package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A geolocation track facet is a grouping of characteristics unique to a set of contiguous geolocation entries representing a path/track taken."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class GeoLocationTrackFacet extends Facet {

  private ObservableObject application;
  private List<ObservableObject> geoLocationEntry;
  private String endTime;
  private String startTime;

}