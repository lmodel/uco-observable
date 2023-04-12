package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A database record facet contains properties associated with a specific table record value from a database."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class TableFieldFacet extends Facet {

  private boolean recordFieldIsNull;
  private String recordFieldName;
  private String tableName;
  private String tableSchema;
  private String recordFieldValue;
  private String recordRowID;

}