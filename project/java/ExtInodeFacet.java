package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An extInode facet is a grouping of characteristics unique to a file system object (file, directory, etc.) conformant to the extended file system (EXT or related derivations) specification."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ExtInodeFacet extends Facet {

  private String extDeletionTime;
  private String extInodeChangeTime;
  private Integer extFileType;
  private Integer extFlags;
  private Integer extHardLinkCount;
  private Integer extInodeID;
  private Integer extPermissions;
  private Integer extSGID;
  private Integer extSUID;

}