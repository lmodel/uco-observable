package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A twitter profile facet is a grouping of characteristics unique to an explicit digital representation of identity and characteristics of the owner of a single Twitter user account. [based on https://en.wikipedia.org/wiki/User_profile]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class TwitterProfileFacet extends Facet {

  private ObservableObject profileBackgroundLocation;
  private ObservableObject profileBannerLocation;
  private ObservableObject profileImageLocation;
  private Hash profileBackgroundHash;
  private Hash profileBannerHash;
  private Hash profileImageHash;
  private boolean profileIsProtected;
  private boolean profileIsVerified;
  private Integer listedCount;
  private String favoritesCount;
  private String followersCount;
  private String friendsCount;
  private String statusesCount;
  private String twitterHandle;
  private String twitterId;
  private String userLocationString;

}