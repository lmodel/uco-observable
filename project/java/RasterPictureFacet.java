package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  "A raster picture facet is a grouping of characteristics unique to a raster (or bitmap) image."
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class RasterPictureFacet extends Facet {

  private ObservableObject camera;
  private Integer bitsPerPixel;
  private Integer pictureHeight;
  private Integer pictureWidth;
  private String imageCompressionMethod;
  private String pictureType;

}