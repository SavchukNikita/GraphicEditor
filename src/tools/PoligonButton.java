/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import shapes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author George
 */
public class PoligonButton extends Button {
    public PoligonButton(Queue queue){
        super("Poligon");
        this.addActionListener(new ActionListener(){
            
             @Override
             public void actionPerformed(ActionEvent arg0){
                 queue.addShape(new Poligon());
             }
        });
    }
}
