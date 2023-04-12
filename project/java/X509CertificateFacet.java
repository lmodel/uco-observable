package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A X.509 certificate facet is a grouping of characteristics unique to a public key digital identity certificate conformant to the X.509 PKI (Public Key Infrastructure) standard."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class X509CertificateFacet extends Facet {

  private X509V3ExtensionsFacet x509v3extensions;
  private Hash issuerHash;
  private Hash subjectHash;
  private Hash thumbprintHash;
  private boolean isSelfSigned;
  private String validityNotAfter;
  private String validityNotBefore;
  private Integer subjectPublicKeyExponent;
  private String issuer;
  private String serialNumber;
  private String signature;
  private String signatureAlgorithm;
  private String subject;
  private String subjectPublicKeyAlgorithm;
  private String subjectPublicKeyModulus;
  private String version;

}