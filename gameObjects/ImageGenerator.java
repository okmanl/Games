package gameObjects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/** a
 * Created by Eric Gumba and Leo Wang on 4/21/17. d
 */
public class ImageGenerator extends TankWorld{

    public Image getImage( String name ) {
      try {
        URL url = TankWorld.class.getResource( name );
        Image img = getToolkit().getImage( url );
        MediaTracker tracker = new MediaTracker(this);
        tracker.addImage( img, 0 );
        tracker.waitForID(0);
        return img;
      } catch ( Exception e ) {
        System.out.println( e + "the image can't be added: " + name );
        return null;
      }
    }

 /** a
   * getBufferedImage method.
   * @param name
   */
    public BufferedImage getBufferedImage( String name ) throws IOException {
      URL url = TankWorld.class.getResource( name );
      BufferedImage img = ImageIO.read( url );
      try {
        MediaTracker tracker = new MediaTracker(this);
        tracker.addImage( img, 0 );
        tracker.waitForID( 0 );
      } catch ( Exception e ) {
        System.out.println( e + "the image can't be added" + name );
      }
      return img;
    }
}
