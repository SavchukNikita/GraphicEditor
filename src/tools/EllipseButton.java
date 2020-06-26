/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import shapes.Ellipse;
import shapes.Shape;

/**
 *
 * @author user
 */
public class EllipseButton extends Button {
    
    Ellipse ellipse = new Ellipse();
            
    public EllipseButton(String name) {
        super(name);
    }
    @Override
    public Shape getShape(){
        return ellipse;
    }
}
