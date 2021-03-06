package gameObjects;

import java.awt.*;

/** a
 * Created by ericgumba and Leo Wang on 4/23/17. d
 */
public class IndestructibleWall extends TankWorld {

  private Image wallImage = imageGenerator.getImage("Resources/Blue_wall1.png");
  private int x, y, width, height;

   /** a
   * IndestructibleWall constructor
   * @param x
   * @param y
   */
  IndestructibleWall(int x, int y) {
    this.x = x;
    this.y = y;
    width = wallImage.getWidth(null);
    height = wallImage.getHeight(null);
  }

 /** 
   * update method
   */ 
  public void update() {
    for ( Bullet bullet : tankOneBullets )
      if ( bullet.collision( x + 20, y, width - 20, height )){
      }
    for ( Bullet bullet : tankTwoBullets ) {
      if ( bullet.collision( x + 20, y, width - 20, height )) {
      }
    }
  }

 /** 
   * draw method
   * @param g
   */   
  public void draw( Graphics g ) {
      g.drawImage( wallImage, x, y, observer );
  }

  /** 
   * collision method
   * @param oX
   * @param oY
   * @param oW
   * @param oH
   */    
  public boolean collision( int oX, int oY, int oW, int oH ) {
      if (( oY + oH > this.y ) && ( oY < this.y + height)) {
        if (( oX + oW > this.x ) && ( oX < this.x + width )) {
          return true;
        }
      }
    return false;
  }
}
