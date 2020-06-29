/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.List;

/**
 *
 * @author user
 */
public abstract class Shape {
    abstract public void addCoordinate(Point2D point);
    abstract public void putCoordinate(Point2D point);
    abstract public void drawShape(Graphics g);
    abstract public void setColor(Color currentColor);
    abstract public Color getColor();
    abstract public String getType();
    abstract public List<Point2D> getPoints();
    abstract public void setCoordinates(List<Point2D> point);
}
