package src.game;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

/**
 *  @ SFSU Spring 2017 CSC413 assignment 4 4/18/2017
 */

public interface WallObjectInterface {
    void update();
    void draw(Graphics g, ImageObserver obs);
}
