/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicedior;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import shapes.Ellipse;
import shapes.Line;
import shapes.PolyLine;
import shapes.Queue;
import shapes.Rectangle;

/**
 *
 * @author user
 */
public class EditorCanvas extends JPanel {
    private static final long serialVersionUID = 1L;
    private final int width = 700;
    private final int height = 400;
    private BufferedImage buffer;
    private Graphics graph;
    boolean releasedFlag;
    EditorCanvas canvas;
    Queue queue;
    String currentShape;
    Color currentColor;
    
    EditorCanvas(int parentWidth, int parentHeight){
        this();
        queue = new Queue();
        currentColor = Color.BLACK;
        setNewBounds(parentWidth, parentHeight);
        buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        graph = buffer.getGraphics();
        setVisible(true);
        this.paintBuffer();
    }
    
    public Queue getQueue(){
        return queue;
    }
    
    public void setCurrentShape(String currentShape){
        this.currentShape = currentShape;
    }
    
    public void setCurrentColor(Color currentColor){
        this.currentColor = currentColor;
    }
    
    public Color getCurrentColor(){
        return currentColor;
    }
    
    public String getCurrentShape(){
        return currentShape;
    }
    
    public void setNewBounds(int parentWidth, int parentHeight){
        setBounds(Math.round((parentWidth-width)/2), Math.round((parentHeight-height)/2+50), width, height);
    }
    
    public EditorCanvas(){
        super();
        canvas = this;
        releasedFlag = false;
        canvas.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if(queue.getLastShape() != null){
                        if(releasedFlag){
                            switch(currentShape){
                                case "Линия":
                                    queue.addShape(new Line());
                                    queue.getLastShape().setColor(currentColor);
                                    break;
                                case "Прямоугольник":
                                    queue.addShape(new Rectangle());
                                    queue.getLastShape().setColor(currentColor);
                                    break;
                                case "Эллипс":
                                    queue.addShape(new Ellipse());
                                    queue.getLastShape().setColor(currentColor);
                                    break;
                                case "Полилиния":
                                    queue.addShape(new PolyLine());
                                    queue.getLastShape().setColor(currentColor);
                                    break;
                            }
                            queue.getLastShape().addCoordinate(e.getX(), e.getY());
                            queue.getLastShape().putCoordinate(e.getX(), e.getY());
                        } else{
                            queue.getLastShape().addCoordinate(e.getX(), e.getY());
                        }
                    } else {
                        queue.addShape(new Line());
                        queue.getLastShape().setColor(currentColor);
                        currentShape = "Линия";
                        queue.getLastShape().addCoordinate(e.getX(), e.getY());
                    }
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    if(!"Полилиния".equals(currentShape)){
                        releasedFlag = true;
                    } else{
                        releasedFlag = false;
                        queue.getLastShape().putCoordinate(e.getX(), e.getY());
                    }
                }
        });

            this.addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    queue.getLastShape().putCoordinate(e.getX(), e.getY());
                    canvas.paintBuffer();
                    canvas.repaint();
                    
                }
            });
            
            
    }
    
    public void paintBuffer(){
        graph.setColor(Color.white);
        graph.fillRect(0, 0, width, height);
        graph.setColor(Color.BLACK);
        
        queue.drawShapes(graph);
    }
    
    
    
    @Override
    public void paint(Graphics g){
        g.drawImage(buffer, 0, 0, this);
    }
    
}
