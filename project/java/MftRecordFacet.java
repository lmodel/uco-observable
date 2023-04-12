package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An MFT record facet is a grouping of characteristics unique to the details of a single file as managed in an NTFS (new technology filesystem) master file table (which is a collection of information about all files on an NTFS filesystem). [based on https://docs.microsoft.com/en-us/windows/win32/devnotes/master-file-table]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class MftRecordFacet extends Facet {

  private String mftFileNameAccessedTime;
  private String mftFileNameCreatedTime;
  private String mftFileNameModifiedTime;
  private String mftFileNameRecordChangeTme;
  private String mftRecordChangeTime;
  private Integer mftFileID;
  private Integer mftFileNameLength;
  private Integer mftFlags;
  private Integer mftParentID;
  private Integer ntfsHardLinkCount;
  private String ntfsOwnerID;
  private String ntfsOwnerSID;

}