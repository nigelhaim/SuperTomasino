package supertomasino;

import java.awt.*;
import java.awt.geom.*;
import java.util.Date;
import javax.swing.*;
import java.io.IOException; // For IOException
import javax.imageio.ImageIO; // For ImageIO
import java.awt.image.BufferedImage;
import supertomasino.MarioTest; 
import supertomasino.SuperTomasinoChar;
/**
 *
 * @author nigel
 */
public class SuperTomasino extends Frame{

    /**
     * @param args the command line arguments
     */

    private void clearCanvas(Graphics2D g2d) {
        Color background = new Color(0,138,197);
        g2d.setPaint(background);
        g2d.fill(new Rectangle(0, 0, 1500, 1500));
    }
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        // MarioTest marioTest = new MarioTest();
        // marioTest.draw(g2d);

        AffineTransform original = g2d.getTransform();
        for (int i = 0; i < 15; i++) {
            clearCanvas(g2d);

            AffineTransform translate_mario = new AffineTransform();
            AffineTransform scale_mario = new AffineTransform();
            translate_mario.setToTranslation(10, 640);
            scale_mario.setToScale(0.5, 0.5);



            g2d.transform(translate_mario);
            for(int j = 0; j < 50; j++){
                clearCanvas(g2d);
                g2d.setTransform(original);
                // System.out.println(getClass().getResource("images/floor.png"));
                BufferedImage floor = null;
                try {
                    floor = ImageIO.read(getClass().getResource("images/floor.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }  
                g2d.drawImage(floor, 0, 900, 1500,200, this);
                g2d.transform(translate_mario);
                g2d.transform(scale_mario);   
                AffineTransform translate = new AffineTransform();
                g2d.transform(translate);
                AffineTransform moveTo = new AffineTransform();
                moveTo.setToTranslation(10+(j*50), 0);
                g2d.transform(moveTo);
                SuperTomasinoChar stc = new SuperTomasinoChar();
                stc.Walk(g2d, 1);
                stc.Jump(g2d);
                sustain(10);
            }
            g2d.setTransform(original);
        }
    }
    public static void sustain(long t){
        long finish = (new Date()).getTime() + t;
        while((new Date()).getTime() < finish){
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Color background = new Color(0,138,197);
        SuperTomasino st = new SuperTomasino();
        st.setSize(1500,1500);
        st.setBackground(background);
        st.setTitle("Super Tomasino | Nigel Haim N. Sebastian");
        st.setVisible(true);
    }
    
}
