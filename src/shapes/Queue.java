/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Queue {
    ArrayList<Shape> queue = new ArrayList<>();
    
    public int getSize(){
        return queue.size();
    }
    
    public void addShape(Shape shape){
        queue.add(shape);
    }
    
    public Shape getLastShape(){
        if (queue.size() == 0) return null;
        return queue.get(queue.size()-1);
    }
    
    public void drawShapes(Graphics g){
        for(Shape shape: queue){
            shape.drawShape(g);
        }
    }
    
}
