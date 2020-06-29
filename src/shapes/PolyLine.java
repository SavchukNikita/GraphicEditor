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
public class PolyLine extends Shape {
    ArrayList<Integer> x;
    ArrayList<Integer> y;
    int lastX;
    int lastY;
    Color currentColor;
    List<Point2D> coordinates;
    private int[] x1, y1;
    
    public PolyLine() {
        coordinates = new ArrayList<Point2D>();
        x = new ArrayList<>();
        y = new ArrayList<>();

    }
    
    @Override
    public void addCoordinate(Point2D point){
        coordinates.add(point);
        x.add((int) point.getX());
        y.add((int) point.getY());
    }
    @Override
    public void putCoordinate(Point2D point){
        this.coordinates.set(this.coordinates.size() - 1, point);
        this.x.set(this.x.size() - 1, (int) point.getX());
        this.y.set(this.y.size() - 1, (int) point.getY());
    }
    
    @Override
    public void setColor(Color currentColor){
        this.currentColor = currentColor;
    }
    
    @Override
    public void drawShape(Graphics g){
        g.setColor(currentColor);
        x1 = new int[x.size()];
        y1 = new int[x.size()];
        for (int i = 0; i < x.size(); i++) {
            x1[i] = x.get(i);
            y1[i] = y.get(i);
        }
        g.drawPolyline(x1, y1, x.size());
    }

    @Override
    public Color getColor() {
        return currentColor;
    }

    @Override
    public String getType() {
        return ("Polyline");
    }

    @Override
    public List<Point2D> getPoints() {
         return coordinates; 
    }

    @Override
    public void setCoordinates(List<Point2D> point) {
        for (int i = 0; i<point.size(); i++){
            addCoordinate(point.get(i));
        }
    }
}
