package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A mutex facet is a grouping of characteristics unique to a mechanism that enforces limits on access to a resource when there are many threads of execution. A mutex is designed to enforce a mutual exclusion concurrency control policy, and with a variety of possible methods there exists multiple unique implementations for different applications. [based on https://en.wikipedia.org/wiki/Lock_(computer_science)]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class MutexFacet extends Facet {

  private boolean isNamed;
  private String mutexName;

}