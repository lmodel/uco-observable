package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An HTTP connection facet is a grouping of characteristics unique to portions of a network connection that are conformant to the Hypertext Transfer Protocol (HTTP) standard."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class HTTPConnectionFacet extends Facet {

  private ObservableObject httpMessageBodyData;
  private Integer httpMessageBodyLength;
  private Dictionary httpRequestHeader;
  private String requestMethod;
  private String requestValue;
  private String requestVersion;

}