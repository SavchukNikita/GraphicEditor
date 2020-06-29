/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorButtons;

import colorButtons.ColorChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import shapes.Queue;
import tools.ColorDialog;

/**
 *
 * @author user
 */
public class CurrentColorButton extends JButton {
    
    CurrentColorButton currentColorButton = this;

    public CurrentColorButton(Queue queue, JFrame frame) {
        this.setBackground(queue.getCurrentColor());
        this.setBounds(15, 5, 20, 20);
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                ColorDialog colordialog = new ColorDialog(frame, "Выбор цвета", new ColorChooser(queue, currentColorButton));
                colordialog.setVisible(true);
            }
        });
    }
    
}
