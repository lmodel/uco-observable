package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A content data facet is a grouping of characteristics unique to a block of digital data."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ContentDataFacet extends Facet {

  private ObservableObject dataPayloadReferenceURL;
  private List<Hash> hash;
  private boolean isEncrypted;
  private BigDecimal entropy;
  private Integer sizeInBytes;
  private String dataPayload;
  private String magicNumber;
  private String mimeClass;
  private List<String> mimeType;
  private String byteOrder;

}