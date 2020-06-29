/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicedior;



import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.*;
import shapes.*;
import shapes.Queue;


public class EditorCanvas extends JPanel {
    EditorCanvas that;
    BufferedImage buf;
    Graphics buffer;
    int width;
    int height;
    Queue q;



    public EditorCanvas(int width, int height,Queue q){
        this();
        this.width = width;
        this.height = height;
        this.q = q;
        this.setNewBounds(width, height);
        buf = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        buffer = buf.getGraphics();
        buffer.setColor(Color.white);
        buffer.fillRect(0, 0, width, height);
    }

    public EditorCanvas(){
        super();
        that= this;

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 q.getLastShape().addCoordinate(e.getPoint());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getY()>=0){
                    q.getLastShape().addCoordinate(e.getPoint());
                    q.getLastShape().putCoordinate(e.getPoint());
                    that.PaintToBuffer();
                    that.repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getY()>=0){
                    q.getLastShape().putCoordinate(e.getPoint());
                    that.PaintToBuffer();
                    that.repaint();
                    if(Line.class.isInstance(q.getLastShape())){
                        q.addShape(new Line());
                    }
                    
                    if(Ellipse.class.isInstance(q.getLastShape())){
                        q.addShape(new Ellipse());
                    }
                    
                    
                    if(shapes.Rectangle.class.isInstance(q.getLastShape())){
                        q.addShape(new shapes.Rectangle());
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        }
        );
        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (e.getY()>=0){
                    q.getLastShape().putCoordinate(e.getPoint());
                    that.PaintToBuffer();
                    that.repaint();

                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

    }
    public void PaintToBuffer() {

        buffer.setColor(Color.white);
        buffer.fillRect(0,0,1600,1000);
        buffer.setColor(Color.black);

        q.drawShapes(buffer);
    }
    @Override
    public void paint(Graphics g){
        g.drawImage(buf, 0, 0, that);
    }
    
    public void setNewBounds(int parentWidth, int parentHeight){
        this.setBounds(Math.round((parentWidth-width)/2), Math.round((parentHeight-height)/2+50), width, height);
    }


}
