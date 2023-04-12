package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A UNIX volume facet is a grouping of characteristics unique to a single accessible storage area (volume) with a single UNIX file system. [based on https://en.wikipedia.org/wiki/volume_(computing)]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class UNIXVolumeFacet extends Facet {

  private String mountPoint;
  private String options;

}