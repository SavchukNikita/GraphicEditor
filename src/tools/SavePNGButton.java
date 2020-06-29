package tools;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 * @author user
 */
public class SavePNGButton extends Button {

    private static final long serialVersionUID = 1L;

    public SavePNGButton(String name) {
        super(name);
    }

    public void SavePNG(BufferedImage paintImage) {
        try {
            ImageIO.write(paintImage, "PNG", new File("./filename.png"));
        } catch (IOException e) {
            System.out.println("--saved");
            e.printStackTrace();
        }
    }
}