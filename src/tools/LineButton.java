/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import shapes.Line;
import shapes.Queue;

/**
 *
 * @author user
 */
public class LineButton extends Button {

    public LineButton(Queue queue) {
        super("Line");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                queue.addShape(new Line());
            }
        });
    }
}
