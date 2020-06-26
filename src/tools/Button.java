/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import javax.swing.JButton;
import shapes.Shape;

/**
 *
 * @author user
 */
public abstract class Button extends JButton {
    Shape shape;
    String name;
    
    Button(String name){
        super(name);
    }
    
    public Shape getShape(){
        return shape;
    }
}
