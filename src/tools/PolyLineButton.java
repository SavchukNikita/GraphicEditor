/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import shapes.PolyLine;
import shapes.Shape;

/**
 *
 * @author user
 */
public class PolyLineButton extends Button {
    
    PolyLine polyLine = new PolyLine();
    
    public PolyLineButton(String name) {
        super(name);
    }
    
    @Override
    public Shape getShape(){
        return polyLine;
    }
    
}
