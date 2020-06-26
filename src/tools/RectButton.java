/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;


import shapes.Rectangle;
import shapes.Shape;

/**
 *
 * @author user
 */
public class RectButton extends Button {
    
    Rectangle rect = new Rectangle();
    
    public RectButton(String name) {
        super(name);
    }
    
    @Override
    public Shape getShape(){
        return rect;
    }
    
}
