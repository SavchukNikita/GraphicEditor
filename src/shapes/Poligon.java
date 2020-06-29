/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George
 */
public class Poligon extends Shape{
    Color currentColor;
    ArrayList<Integer> x;
    ArrayList<Integer> y;
    List<Point2D> coordinates;
    int[] x1, y1;

    public Poligon() {
        coordinates = new ArrayList<Point2D>();
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();

    }

    @Override
    public void addCoordinate(Point2D point) {
        coordinates.add(point);
        this.x.add((int) point.getX());
        this.y.add((int) point.getY());
    }

    @Override
    public void putCoordinate(Point2D point) {
        this.coordinates.set(this.coordinates.size() - 1, point);
        this.x.set(this.x.size() - 1, (int) point.getX());
        this.y.set(this.y.size() - 1, (int) point.getY());
    }

    @Override
    public void drawShape(Graphics g) {
        g.setColor(currentColor);
        x1 = new int[x.size()];
        y1 = new int[x.size()];
        for (int i = 0; i < x.size(); i++) {
            x1[i] = x.get(i);
            y1[i] = y.get(i);
        }
        g.drawPolygon(x1, y1, x.size());

    }

    @Override
    public void setColor(Color color) {
        this.currentColor = color;
    }

    @Override
    public Color getColor() {
       return currentColor; 
    }

    @Override
    public String getType() {
        return ("Polygon"); 
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
