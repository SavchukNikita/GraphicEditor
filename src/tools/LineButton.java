/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import shapes.Line;
import shapes.Shape;

/**
 *
 * @author user
 */
public class LineButton extends Button {
    
    Line line = new Line();
    
    
    public LineButton(String name) {
        super(name);
    }
    
    @Override
    public Shape getShape(){
        return line;
    }
}
