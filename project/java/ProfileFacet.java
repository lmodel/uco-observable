package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A profile facet is a grouping of characteristics unique to an explicit digital representation of identity and characteristics of the owner of a single user account associated with an online service or application. [based on https://en.wikipedia.org/wiki/User_profile]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ProfileFacet extends Facet {

  private Identity profileIdentity;
  private ContactAddress contactAddress;
  private ContactEmail contactEmail;
  private ContactMessaging contactMessaging;
  private ContactPhone contactPhone;
  private ContactURL contactURL;
  private ObservableObject profileAccount;
  private ObservableObject profileService;
  private ObservableObject profileWebsite;
  private String profileCreated;
  private String name;
  private String displayName;

}