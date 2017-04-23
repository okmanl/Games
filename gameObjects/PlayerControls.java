package gameObjects;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by ericgumba on 4/22/17.
 */
public class PlayerControls extends KeyAdapter {

  TankWorldEvents tankWorldEvents;

  public PlayerControls( TankWorldEvents tankWorldEvents ){
    this.tankWorldEvents = tankWorldEvents;
  }

  public void keyPressed( KeyEvent pressed ){
    tankWorldEvents.setTankEvent(pressed, 1);
  }
  public void keyReleased(KeyEvent released ){
    tankWorldEvents.setTankEvent(released, 0);
  }
}
