/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicedior;

import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;
import shapes.Queue;

/**
 *
 * @author user
 */
public class Window extends JFrame {

  private final EditorCanvas canvas;
  private final JFrame frame = this;
  private final Queue queue = Queue.singleton();
  private final int toolbarHeigh = 50;
  private final int frameWidth = 1500;
  private final int frameHeight = 1000;

  public Window() {
    this.setTitle("Editor");
    this.setLayout(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setPreferredSize(new Dimension(frameWidth, frameHeight));
    this.pack();

    canvas = new EditorCanvas(getContentPane().getWidth(), getContentPane().getHeight() - toolbarHeigh, queue);
    this.add(canvas);

    Toolbar toolbar = new Toolbar(queue, frame, canvas);
    this.add(toolbar);
    
    this.setVisible(true);

    this.addComponentListener(new ComponentAdapter() {
      public void componentResized(ComponentEvent evt) {
        canvas.setNewBounds(getContentPane().getWidth(), getContentPane().getHeight() - toolbarHeigh);
        toolbar.setBounds(0, 0, getContentPane().getWidth(), toolbarHeigh);
      }
    });

  }

}
