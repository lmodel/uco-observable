package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An X.509 v3 certificate extensions facet is a grouping of characteristics unique to a public key digital identity certificate conformant to the X.509 v3 PKI (Public Key Infrastructure) standard."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class X509V3ExtensionsFacet extends Facet {

  private String privateKeyUsagePeriodNotAfter;
  private String privateKeyUsagePeriodNotBefore;
  private String authorityKeyIdentifier;
  private String basicConstraints;
  private String certificatePolicies;
  private String crlDistributionPoints;
  private String extendedKeyUsage;
  private String inhibitAnyPolicy;
  private String issuerAlternativeName;
  private String keyUsage;
  private String nameConstraints;
  private String policyConstraints;
  private String policyMappings;
  private String subjectAlternativeName;
  private String subjectDirectoryAttributes;
  private String subjectKeyIdentifier;

}