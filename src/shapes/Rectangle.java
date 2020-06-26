/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author user
 */
public class Rectangle extends Shape {
    int x;
    int y;
    int lastX;
    int lastY;
    Color currentColor;
    
    @Override
    public void addCoordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void putCoordinate(int x, int y){
        lastX = x;
        lastY = y;
    }
    
    @Override
    public void setColor(Color currentColor){
        this.currentColor = currentColor;
    }
    @Override
    public void drawShape(Graphics g){
        g.setColor(currentColor);
        if(lastX>=x){
            if(lastY>=y){
                g.drawRect(x, y, lastX-x, lastY-y);
            } else{
                g.drawRect(x, lastY, lastX-x, y-lastY);
            }
        } else{
            if(lastY>=y){
                g.drawRect(lastX, y, x-lastX, lastY-y);
            } else{
                g.drawRect(lastX, lastY, x-lastX, y-lastY);
            }
        }
    }
}
