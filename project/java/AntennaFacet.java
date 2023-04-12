package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An antenna alignment facet contains the metadata surrounding the cell tower's antenna position."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class AntennaFacet extends Facet {

  private BigDecimal antennaHeight;
  private BigDecimal azimuth;
  private BigDecimal elevation;
  private BigDecimal horizontalBeamWidth;
  private BigDecimal signalStrength;
  private BigDecimal skew;

}