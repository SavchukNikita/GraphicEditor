
package graphicedior;

import colorButtons.CurrentColorButton;
import colorButtons.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import shapes.Queue;

public class ColorBar extends JToolBar {
    
     public ColorBar(Queue queue, JFrame frame) {
        super("ColorBar", JToolBar.HORIZONTAL);
        this.setLayout(null);
        this.setBounds(0, 50, 260, 30);
        this.setFloatable(false);
        CurrentColorButton currentColorButton = new CurrentColorButton(queue, frame);
        this.add(currentColorButton);
        this.add(new WhiteColorButton(queue, currentColorButton));
        this.add(new RedColorButton(queue, currentColorButton));
        this.add(new OrangeColorButton(queue, currentColorButton));
        this.add(new CyanColorButton(queue, currentColorButton));
        this.add(new YellowColorButton(queue, currentColorButton));
        this.add(new BlueColorButton(queue, currentColorButton));
        this.add(new BlackColorButton(queue, currentColorButton));
    }
}
