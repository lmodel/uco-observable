package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A software facet is a grouping of characteristics unique to a software program (a definitively scoped instance of a collection of data or computer instructions that tell the computer how to work). [based on https://en.wikipedia.org/wiki/Software]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class SoftwareFacet extends Facet {

  private Identity manufacturer;
  private String cpeid;
  private String language;
  private String swid;
  private String version;

}