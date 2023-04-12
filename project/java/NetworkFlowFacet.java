package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A network flow facet is a grouping of characteristics unique to a sequence of data transiting one or more digital network (a group of two or more computer systems linked together) connections. [based on https://www.webopedia.com/TERM/N/network.html]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class NetworkFlowFacet extends Facet {

  private ObservableObject dstPayload;
  private ObservableObject srcPayload;
  private Dictionary ipfix;
  private Integer dstBytes;
  private Integer dstPackets;
  private Integer srcBytes;
  private Integer srcPackets;

}