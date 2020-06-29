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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Line extends Shape {
    int x;
    int y;
    int lastX;
    int lastY;
    Color currentColor;
    List<Point2D> coordinates;
    
    public Line(){
        coordinates = new ArrayList<Point2D>();
        x = 0;
        y = 0;
        lastX = 0;
        lastY = 0;
        coordinates.add(new Point2D.Double(x, y));
        coordinates.add(new Point2D.Double(lastX, lastY));
    }
    
    @Override
    public void addCoordinate(Point2D point){
        coordinates.set(0, point);
        this.x = (int) point.getX();
        this.y = (int) point.getY();
    }
    @Override
    public void putCoordinate(Point2D point){
        coordinates.set(1,point);
        lastX = (int) point.getX();
        lastY = (int) point.getY();
    }
    
    @Override
    public void setColor(Color currentColor){
        this.currentColor = currentColor;
    }
    
    @Override
    public void drawShape(Graphics g){
        g.setColor(currentColor);
        g.drawLine(x, y, lastX, lastY);
    }

    @Override
    public Color getColor() {
        return currentColor; 
    }

    @Override
    public String getType() {
        return("Line");
    }

    @Override
    public List<Point2D> getPoints() {
        return coordinates;
    }

    @Override
    public void setCoordinates(List<Point2D> point) {
        addCoordinate(point.get(0));
        putCoordinate(point.get(1));
    }
}
