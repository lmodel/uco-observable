package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A captured telecommunications information facet represents certain information within captured or intercepted telecommunications data."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CapturedTelecommunicationsInformationFacet extends Facet {

  private CellSite captureCellSite;
  private String startTime;
  private String endTime;
  private String interceptedCallState;

}