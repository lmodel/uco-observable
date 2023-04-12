package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A library facet is a grouping of characteristics unique to a suite of data and programming code that is used to develop software programs and applications. [based on https://www.techopedia.com/definition/3828/software-library]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class LibraryFacet extends Facet {

  private String libraryType;

}