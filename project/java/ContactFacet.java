package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A contact facet is a grouping of characteristics unique to a set of identification and communication related details for a single entity."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ContactFacet extends Facet {

  private ContactAddress contactAddress;
  private ContactAffiliation contactAffiliation;
  private ContactEmail contactEmail;
  private ContactMessaging contactMessaging;
  private ContactPhone contactPhone;
  private ContactProfile contactProfile;
  private ContactSIP contactSIP;
  private ContactURL contactURL;
  private ObservableObject sourceApplication;
  private String birthdate;
  private String lastTimeContacted;
  private Integer numberTimesContacted;
  private String contactID;
  private String displayName;
  private String firstName;
  private String lastName;
  private String middleName;
  private String namePhonetic;
  private String namePrefix;
  private String nameSuffix;
  private String contactGroup;
  private String contactNote;
  private String nickname;

}