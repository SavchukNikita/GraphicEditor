package tools;

import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import graphicedior.EditorCanvas;
import shapes.Queue;

public class ClearButton extends Button {

    public ClearButton(String name) {
        super(name);
    }

    /* public void ClearBT(BufferedImage paintImage, Queue queue, EditorCanvas canvas) {

        paintImage.flush();
        queue.ClearQueue();
        canvas.revalidate();
        canvas.paintBuffer();
        canvas.repaint();
    } */
}