package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A mobile account facet is a grouping of characteristics unique to an arrangement with an entity to enable and control the provision of some capability or service on a portable computing device. [based on https://www.lexico.com/definition/mobile_device]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class MobileAccountFacet extends Facet {

  private String iMSI;
  private String mSISDN;
  private String mSISDNType;

}