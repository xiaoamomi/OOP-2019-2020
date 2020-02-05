package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet{
    float playerX;
    float playerY;
    float playerWidth;
    
    public void drawPlayer(float x, float y, float w)
    {
        stroke(255);
        fill(0);
        rect(x-w/2, y-10, w, 20, 10, 10, 0, 0);
        fill(0);
        line(x, y-10, x, y-15);
    }

    public void settings()
    {
        size(600,600);
    }

    public void setup()
    {
        playerX = width/2;
        playerY = height - 20;
        playerWidth = 50;
    }

    public void draw()
    {
        background(0);
        drawPlayer(playerX, playerY, playerWidth);
    }

    public void keyPressed()
    {
        if(keyCode == LEFT)
        {
            playerX --;
        }
        if(keyCode == RIGHT)
        {
            playerX ++;
        }
        if(keyCode == ' ')
        {
            line(playerX, playerY-10, playerX, 0);
        }
    }
}