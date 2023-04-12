package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An SQLite blob facet is a grouping of characteristics unique to a blob (binary large object) of data within an SQLite database. [based on https://en.wikipedia.org/wiki/SQLite]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class SQLiteBlobFacet extends Facet {

  private List<String> rowIndex;
  private String columnName;
  private String rowCondition;
  private String tableName;

}