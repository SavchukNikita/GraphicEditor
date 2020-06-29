/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicedior;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import shapes.Queue;
import tools.*;

/**
 *
 * @author user
 */
public class Toolbar extends JToolBar {

    public Toolbar(Queue queue, JFrame frame, EditorCanvas canvas) {
        super("Toolbar", JToolBar.HORIZONTAL);
        this.setBounds(0, 0, frame.getContentPane().getWidth(), 50);
        this.setFloatable(false);
        this.add(new LineButton(queue));
        this.add(new PolyLineButton(queue));
        this.add(new RectButton(queue));
        this.add(new EllipseButton(queue));
        this.add(new PoligonButton(queue));
        this.add(new SaveButton());
        this.add(new LoadButton(canvas));
        this.add(new ColorBar(queue, frame));
    }
    
    
    
}
