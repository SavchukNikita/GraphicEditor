/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import shapes.Queue;

public class BlueColorButton extends BaseColorButton {
    
    BaseColorButton colorButton = this;
    
    public BlueColorButton(Queue queue, CurrentColorButton currentColorButton){
	super();
        this.setBackground(this.getColor());
        this.setBounds(140, 5, 15, 15);
        this.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            queue.setCurrentColor(colorButton.getColor());
            currentColorButton.setBackground(colorButton.getColor());
            queue.getLastShape().setColor(colorButton.getColor());
      }
    });
    }

    @Override
    public Color getColor() {
        return Color.BLUE;
    }
}
