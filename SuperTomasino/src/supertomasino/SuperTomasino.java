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
        g2d.fill(new Rectangle(-100, -100, 10000, 10000));
    }
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        // MarioTest marioTest = new MarioTest();
        // marioTest.draw(g2d);

        AffineTransform original = g2d.getTransform();
        for (int i = 0; i < 15; i++) {
            clearCanvas(g2d);
            SuperTomasinoChar stc = new SuperTomasinoChar();
            Sun sun = new Sun();

            AffineTransform translate_mario = new AffineTransform();
            AffineTransform scale_mario = new AffineTransform();
            AffineTransform moveTo = new AffineTransform();
            AffineTransform translate_sun = new AffineTransform();   
            translate_mario.setToTranslation(10, 750);
            scale_mario.setToScale(0.3, 0.3);
            translate_sun.setToTranslation(600, 425);

            BufferedImage floor = null;
            try {
                floor = ImageIO.read(getClass().getResource("images/floor.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }  


            g2d.setTransform(translate_sun);
            sun.Roam(g2d);
            g2d.transform(translate_mario);
            for(int j = 0; j < 15; j++){
                clearCanvas(g2d);
                g2d.setTransform(original);
                g2d.drawImage(floor, 0, 900, 1900,200, this);
                g2d.transform(translate_mario);
                g2d.transform(scale_mario);   
                moveTo.setToTranslation(10+(j*75), 0);
                g2d.transform(moveTo);
                stc.Walk(g2d, 1);
                sustain(1);
                System.out.println("Walk:" + j);
            }
            AffineTransform jumpup = new AffineTransform();
            for(int k = 0; k<10; k++){
                clearCanvas(g2d);
                g2d.setTransform(original);
                g2d.drawImage(floor, 0, 900, 1900,200, this);
                g2d.transform(translate_mario);
                g2d.transform(scale_mario);
                moveTo.setToTranslation(1135+(k*60), (-k*75));
                g2d.transform(moveTo);
                stc.Jump(g2d);
                sustain(50);
                System.out.println("Jump:" + k);
            }
            stc.Jump(g2d);
            g2d.setTransform(original);

            AffineTransform jumpdown = new AffineTransform();
            for(int k = 0; k<10; k++){
                clearCanvas(g2d);
                g2d.setTransform(original);
                g2d.drawImage(floor, 0, 900, 1900,200, this);
                g2d.setTransform(translate_sun);
                sun.obtained(g2d, k);
                g2d.setTransform(original);
                g2d.transform(translate_mario);
                g2d.transform(scale_mario);
                moveTo.setToTranslation(1735+(k*60), -750+(k*75));
                g2d.transform(moveTo);
                stc.Jump(g2d);
                sustain(50);
                System.out.println("Jump:" + k);
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
        st.setSize(1900,1500);
        st.setBackground(background);
        st.setTitle("Super Tomasino | Nigel Haim N. Sebastian");
        st.setVisible(true);
    }
    
}
