/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorButtons;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import shapes.Queue;

/**
 *
 * @author user
 */
public class ColorChooser extends JColorChooser {

    ColorChooser colorChooser = this;

    public ColorChooser(Queue queue, CurrentColorButton currentColorButton) {
        super(queue.getCurrentColor());
        this.getSelectionModel().addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                queue.setCurrentColor(colorChooser.getColor());
                currentColorButton.setBackground(queue.getCurrentColor());
                queue.getLastShape().setColor(colorChooser.getColor());
            }
        });
    }
    
    @Override
    public Color getColor() {
        return super.getColor();
    }
    
}
