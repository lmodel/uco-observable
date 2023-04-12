package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "An EXIF (exchangeable image file format) facet is a grouping of characteristics unique to the formats for images, sound, and ancillary tags used by digital cameras (including smartphones), scanners and other systems handling image and sound files recorded by digital cameras conformant to JEIDA/JEITA/CIPA specifications. [based on https://en.wikipedia.org/wiki/Exif]"
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class EXIFFacet extends Facet {

  private List<ControlledDictionary> exifData;

}