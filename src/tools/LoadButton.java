/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import Save.Loader;
import graphicedior.EditorCanvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 *
 * @author user
 */
public class LoadButton extends Button {
    
    public LoadButton(EditorCanvas canvas) {
        super("Load");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Loader(canvas);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }
}
