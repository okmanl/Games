package LazrusObjects;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;
import java.util.Observable;

/**
 * Created by ericgumba on 4/27/17.
 */
public class MainCharacter extends LazarusWorld implements MainCharacterInterface {
  int xLocation, yLocation;
  Image imageOfLazarus;
  int xMove = 200, yMove = 0;
  int boxPosition = 5;
  MainCharacter(){

    imageOfLazarus = imgGen.getImage("Lazarus/Lazarus_stand.png");

    /*
    TO BE REDACTED AT A LATER DATE
     */
    xLocation = 40*boxPosition;
    yLocation = GAMEBOARD_HEIGHT - 145;

  }
  public void move(){

    xLocation = xMove;


  }

  public void draw(Graphics g, ImageObserver obs) {
    g.drawImage(imageOfLazarus, xLocation, yLocation, obs);
  }

  public void update(Observable obj, Object event){
    LazarusEvents lazE = ( LazarusEvents ) event;
    if( lazE.eventType == 0 ){
      KeyEvent keyevnt = (KeyEvent ) lazE.event;
      String lazAction = controls.get( keyevnt.getKeyCode() );
      if ( lazAction.equals("left") ){
        xMove -= 40;
      } else if ( lazAction.equals("right") ){
        xMove += 40;
      }
    }
  }
}

