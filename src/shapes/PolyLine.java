/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PolyLine extends Shape {
    ArrayList<Integer> x = new ArrayList<>();
    ArrayList<Integer> y = new ArrayList<>();
    int lastX;
    int lastY;
    Color currentColor;
    
    @Override
    public void addCoordinate(int x, int y){
        this.x.add(x);
        this.y.add(y);
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
        for(int i = 1; i<x.size(); i++){
            g.drawLine(x.get(i-1), y.get(i-1), x.get(i), y.get(i));
        }
        
        if(!x.isEmpty()){
            g.drawLine(x.get(x.size()-1), y.get(y.size()-1), lastX, lastY);
        }
    }
}
