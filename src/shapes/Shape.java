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
public abstract class Shape {
    public void addCoordinate(int x, int y){}
    public void putCoordinate(int x, int y){}
    public void drawShape(Graphics g){}
    public void setColor(Color currentColor){}
}
