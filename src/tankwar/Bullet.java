package src.tankwar;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import game.BulletObjectInterface;

/**
 * @ SFSU Spring 2017 CSC413 assignment 4 4/18/2017
 */

public class Bullet extends TankWar implements BulletObjectInterface {

    Image img; //the caller (enemy or user) provide the bullet
    int x, y, sizeX, sizeY, xSpeed, ySpeed;
    ImageObserver obs;

    Bullet(Image img, int x, int y, int xSpeed, int ySpeed) {
        this.img = img;//recieve different bullet image when power-up is picked up
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        sizeX = img.getWidth(null);
        sizeY = img.getHeight(null);
        //System.out.println("Bullet w:" + sizeX + " y:" + sizeY);
    }

    public boolean collision(int x, int y, int w, int h) {
        if ((y + h > this.y) && (y < this.y + sizeY)) {
            if ((x + w > this.x) && (x < this.x + sizeX)) {
                this.x = 2 * borderX;
                this.y = 2 * borderY; // When it reaches here. it must be removed.
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean move() {
        y += ySpeed;
        x += xSpeed;
        if ((x > borderX + sizeX || x < -1 * sizeX) || (y > borderY + sizeY || y < -1 * sizeY)) {
            return true;
        } else {
            return false;
        }
    }

    public void draw(Graphics g, ImageObserver obs) {
        g.drawImage(img, x, y, obs);
    }
}
