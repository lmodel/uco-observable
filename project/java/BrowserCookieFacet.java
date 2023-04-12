package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A browser cookie facet is a grouping of characteristics unique to a piece of data sent from a website and stored on the user's computer by the user's web browser while the user is browsing. [based on https://en.wikipedia.org/wiki/HTTP_cookie]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class BrowserCookieFacet extends Facet {

  private String accessedTime;
  private ObservableObject application;
  private ObservableObject cookieDomain;
  private String cookieName;
  private String cookiePath;
  private String expirationTime;
  private boolean isSecure;
  private String observableCreatedTime;

}