/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import shapes.Queue;
import shapes.Rectangle;

/**
 *
 * @author user
 */
public class RectButton extends Button {

    public RectButton(Queue queue) {
        super("Rectangle");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                queue.addShape(new Rectangle());
            }
        });
    }

}
