package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A PDF file facet is a grouping of characteristics unique to a PDF (Portable Document Format) file."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class PDFFileFacet extends Facet {

  private ControlledDictionary documentInformationDictionary;
  private boolean isOptimized;
  private String pdfCreationDate;
  private String pdfModDate;
  private String pdfId1;
  private String version;
  private List<String> pdfId0;

}