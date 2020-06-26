/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicedior;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import shapes.Line;
import shapes.PolyLine;
import shapes.Queue;
import shapes.Rectangle;
import tools.ColorDialog;
import tools.EllipseButton;
import tools.LineButton;
import tools.PolyLineButton;
import tools.RectButton;

/**
 *
 * @author user
 */
public class Window extends JFrame {
 
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    public final EditorCanvas canvas;
    public final JToolBar toolbar;
    private JFrame frame;
    private final int toolbarHeigh = 50;
    private final int frameWidth = 800;
    private final int frameHeight = 600;
    Color maincolor;
    JColorChooser colorChooser;
 
    public Window() {
        setTitle("Editor");
        setLayout(null);
        frame = this;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(frameWidth, frameHeight));
        pack();
        
        
        canvas = new EditorCanvas(getContentPane().getWidth(), getContentPane().getHeight()-toolbarHeigh);
        add(canvas);
        
        
        toolbar = new  JToolBar("Toolbar", JToolBar.HORIZONTAL);
        toolbar.setBounds(0, 0, getContentPane().getWidth(), toolbarHeigh);
        toolbar.setFloatable(false);
        add(toolbar);
        
        JLabel label = new JLabel();
        label.setText("AA");
        toolbar.add(label);
        
        JToolBar colorbar = new  JToolBar("Colorbar", JToolBar.HORIZONTAL);
        colorbar.setBounds(0, 50, 260, 30);
        toolbar.setFloatable(false);
        JButton colorbutton = new  JButton();
        colorbutton.setBackground(maincolor);
        colorbutton.setBounds(15, 5, 20, 20);
        colorbutton.addActionListener(new  ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              { 
                ColorDialog colordialog = new  ColorDialog(frame,"Выбор цвета", colorChooser);
                colordialog.setVisible(true);
              }
            });
        colorbar.add(colorbutton);
           
        JButton redbutton = new  JButton();
        redbutton.setBackground(Color.red);
        redbutton.setBounds(40, 5, 15, 15);
        redbutton.addActionListener(new  ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              { 
                canvas.setCurrentColor(Color.red);
                colorbutton.setBackground(Color.red);
              }
            });
          colorbar.add(redbutton);
           
          JButton orangebutton = new  JButton();
          orangebutton.setBackground(Color.orange);
          orangebutton.setBounds(60, 5, 15, 15);
          orangebutton.addActionListener(new  ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              { 
                canvas.setCurrentColor(Color.orange);
                colorbutton.setBackground(Color.orange);
              }
            });
          colorbar.add(orangebutton);
           
          JButton yellowbutton = new  JButton();
          yellowbutton.setBackground(Color.yellow);
          yellowbutton.setBounds(80, 5, 15, 15);
          yellowbutton.addActionListener(new  ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              { 
                canvas.setCurrentColor(Color.yellow);
                colorbutton.setBackground(Color.yellow);
              }
            });
          colorbar.add(yellowbutton);
           
          JButton greenbutton = new  JButton();
          greenbutton.setBackground(Color.green);
          greenbutton.setBounds(100, 5, 15, 15);
          greenbutton.addActionListener(new  ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              { 
                canvas.setCurrentColor(Color.green);
                colorbutton.setBackground(Color.green);
              }
            });
          colorbar.add(greenbutton);
           
          JButton bluebutton = new JButton();
          bluebutton.setBackground(Color.blue);
          bluebutton.setBounds(120, 5, 15, 15);
          bluebutton.addActionListener(new  ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              { 
                canvas.setCurrentColor(Color.blue);
                colorbutton.setBackground(Color.blue);
              }
            });
          colorbar.add(bluebutton);
           
          JButton cyanbutton = new  JButton();
          cyanbutton.setBackground(Color.cyan);
          cyanbutton.setBounds(140, 5, 15, 15);
          cyanbutton.addActionListener(new  ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              { 
                canvas.setCurrentColor(Color.cyan);
                colorbutton.setBackground(Color.cyan);
              }
            });
          colorbar.add(cyanbutton);
           
          JButton pinkbutton = new  JButton();
          pinkbutton.setBackground(Color.PINK);
          pinkbutton.setBounds(160, 5, 15, 15);
          pinkbutton.addActionListener(new  ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              { 
                canvas.setCurrentColor(Color.PINK);
                colorbutton.setBackground(Color.PINK);
              }
            });
          colorbar.add(pinkbutton);
           
          JButton whitebutton = new  JButton();
          whitebutton.setBackground(Color.white);
          whitebutton.setBounds(180, 5, 15, 15);
          whitebutton.addActionListener(new  ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              { 
                canvas.setCurrentColor(Color.white);
                colorbutton.setBackground(Color.white);
              }
            });
          colorbar.add(whitebutton);
           
          JButton blackbutton = new  JButton();
          blackbutton.setBackground(Color.black);
          blackbutton.setBounds(200, 5, 15, 15);
          blackbutton.addActionListener(new  ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              { 
                canvas.setCurrentColor(Color.BLACK);
                colorbutton.setBackground(Color.BLACK);
              }
            });
          colorbar.add(blackbutton);
          colorbar.setLayout(null);
          frame.add(colorbar);
           
          colorChooser = new  JColorChooser(canvas.getCurrentColor());
          colorChooser.getSelectionModel().addChangeListener(new  ChangeListener()
          {
          public void stateChanged(ChangeEvent e)
          {
            canvas.setCurrentColor(colorChooser.getColor());
            colorbutton.setBackground(canvas.getCurrentColor());
          }
          });
        
        LineButton lineBtn = new  LineButton("Линия");
        toolbar.add(lineBtn);
        lineBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(!canvas.getCurrentShape().equals(((LineButton)lineBtn).getText())){
                    Queue queue = canvas.getQueue();
                    queue.addShape(((LineButton)lineBtn).getShape());
                    canvas.setCurrentShape(((LineButton)lineBtn).getText());
                }
            }
        });
        
        JButton rectBtn = new  RectButton("Прямоугольник");
        toolbar.add(rectBtn);
        rectBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(!canvas.getCurrentShape().equals(((RectButton)rectBtn).getText())){
                    Queue queue = canvas.getQueue();
                    queue.addShape(((RectButton)rectBtn).getShape());
                    canvas.setCurrentShape(((RectButton)rectBtn).getText());
                }
            }
        });
        
        JButton ellipseBtn = new  EllipseButton("Эллипс");
        toolbar.add(ellipseBtn);
        ellipseBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(!canvas.getCurrentShape().equals(((EllipseButton)ellipseBtn).getText())){
                    Queue queue = canvas.getQueue();
                    queue.addShape(((EllipseButton)ellipseBtn).getShape());
                    canvas.setCurrentShape(((EllipseButton)ellipseBtn).getText());
                }
            }
        });
        
        JButton polyLineBtn = new  PolyLineButton("Полилиния");
        toolbar.add(polyLineBtn);
        polyLineBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Queue queue = canvas.getQueue();
                PolyLine polyLine = new PolyLine();
                polyLine.setColor(canvas.getCurrentColor());
                queue.addShape(polyLine);
                canvas.setCurrentShape(((PolyLineButton)polyLineBtn).getText());
                label.setText(String.valueOf(queue.getSize()));
            }
        });
        
        setVisible(true);
        
        this.addComponentListener(new ComponentAdapter() {  
            public void componentResized(ComponentEvent evt) {
                canvas.setNewBounds(getContentPane().getWidth(), getContentPane().getHeight()-toolbarHeigh);
                toolbar.setBounds(0, 0, getContentPane().getWidth(), toolbarHeigh);
            }
        });
    }
    
}
