package Save;


import graphicedior.EditorCanvas;
import shapes.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Loader {
    public Loader(EditorCanvas canvas) throws IOException {
        SaveShapeQueue shapes = new SaveShapeQueue();
        FileInputStream fileInputStream = new FileInputStream("save.ser");
        try (ObjectInputStream stream = new ObjectInputStream(fileInputStream)) {
            try {
                shapes = (SaveShapeQueue) stream.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            Queue queue = Queue.singleton();
            for (SaveShape saveShape : shapes.getShapes()) {
                queue.setCurrentColor(saveShape.getColor());
                if (saveShape.getType().equals("Ellipse")) {
                    queue.addShape(new Ellipse());
                } else if (saveShape.getType().equals("Rectangle")) {
                    queue.addShape(new Rectangle());
                } else if (saveShape.getType().equals("Polygon")) {
                    queue.addShape(new Poligon());
                } else if (saveShape.getType().equals("Polyline")) {
                    queue.addShape(new PolyLine());
                } else if (saveShape.getType().equals("Line")) {
                    queue.addShape(new Line());
                } else throw new RuntimeException();
                
                
                if (saveShape.getPoints().size() != 0) {
                    queue.getLastShape().setCoordinates(saveShape.getPoints());
                }
            }
            canvas.PaintToBuffer();
            canvas.repaint();
        }
    }
}