package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A contact affiliation is a grouping of characteristics unique to details of an organizational affiliation for a single contact entity."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ContactAffiliation extends UcoInherentCharacterizationThing {

  private Organization contactOrganization;
  private ContactAddress organizationLocation;
  private ContactEmail contactEmail;
  private ContactMessaging contactMessaging;
  private ContactPhone contactPhone;
  private ContactProfile contactProfile;
  private ContactURL contactURL;
  private String organizationDepartment;
  private String organizationPosition;

}