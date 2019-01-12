/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Background;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author rizkiramdani
 */
public class Background1 extends JPanel {
    
private Image image;

    public Background1() {
        image = new ImageIcon(getClass().getResource("gam2.jpg")).getImage();
    }
@Override
protected void paintComponent (Graphics grpcs){
super.paintComponent(grpcs);
Graphics2D gd=(Graphics2D)grpcs.create();
        gd.drawImage (image , 0,0,getWidth(),getHeight(), null);
        gd.dispose();   
}
}
