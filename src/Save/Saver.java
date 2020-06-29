package Save;

import shapes.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Saver{
    public Saver() throws IOException {
        SaveShapeQueue Queueshape = new SaveShapeQueue();
        for(Shape shape: Queue.singleton().getQueue()) {
            Queueshape.addShape(new SaveShape(shape));
        }
        FileOutputStream outputStream = new FileOutputStream("save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(Queueshape);
        objectOutputStream.close();
    }
}
