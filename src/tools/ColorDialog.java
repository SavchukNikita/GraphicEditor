/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class ColorDialog extends JDialog {
  private static final long serialVersionUID = 1L;

  public ColorDialog(JFrame owner, String title, JColorChooser colorChooser) {
    super(owner, title, true);
    add(colorChooser);
    setSize(450, 400);
  }
}
