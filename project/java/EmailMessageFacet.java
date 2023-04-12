package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An email message facet is a grouping of characteristics unique to a message that is an instance of an electronic mail correspondence conformant to the internet message format described in RFC 5322 and related RFCs."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class EmailMessageFacet extends Facet {

  private List<MimePartType> bodyMultipart;
  private ObservableObject application;
  private ObservableObject bodyRaw;
  private ObservableObject from;
  private ObservableObject headerRaw;
  private ObservableObject sender;
  private ObservableObject xOriginatingIP;
  private List<ObservableObject> bcc;
  private List<ObservableObject> cc;
  private List<ObservableObject> references;
  private List<ObservableObject> to;
  private Dictionary otherHeaders;
  private boolean isMimeEncoded;
  private boolean isMultipart;
  private boolean isRead;
  private String modifiedTime;
  private String receivedTime;
  private String sentTime;
  private String body;
  private String contentDisposition;
  private String contentType;
  private String inReplyTo;
  private String messageID;
  private String priority;
  private String subject;
  private String xMailer;
  private List<String> categories;
  private List<String> labels;
  private List<String> receivedLines;

}