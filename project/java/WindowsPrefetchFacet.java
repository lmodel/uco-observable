package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A Windows prefetch facet is a grouping of characteristics unique to entries in the Windows prefetch file (used to speed up application startup starting with Windows XP)."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class WindowsPrefetchFacet extends Facet {

  private ObservableObject volume;
  private List<ObservableObject> accessedDirectory;
  private List<ObservableObject> accessedFile;
  private String firstRun;
  private String lastRun;
  private Integer timesExecuted;
  private String applicationFileName;
  private String prefetchHash;

}