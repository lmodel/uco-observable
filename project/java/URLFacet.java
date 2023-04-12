package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A URL facet is a grouping of characteristics unique to a uniform resource locator (URL) acting as a resolvable address to a particular WWW (World Wide Web) accessible resource."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class URLFacet extends Facet {

  private ObservableObject host;
  private Integer port;
  private String fragment;
  private String fullValue;
  private String password;
  private String path;
  private String query;
  private String scheme;
  private String userName;

}