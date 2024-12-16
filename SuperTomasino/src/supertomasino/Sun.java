package supertomasino;
import java.awt.*;
import java.awt.geom.*;
import java.util.Date;
import java.io.IOException; // For IOException
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO; // For ImageIO

public class Sun{
    public void clearCanvas(Graphics2D g2d) {
        Color background = new Color(0,138,197);
        g2d.setPaint(background);
        // g2d.setPaint(Color.WHITE);
        g2d.fillRect(-100, -80, 300,300); // Replace 800 and 600 with your actual canvas dimensions
    }
    public void Roam(Graphics2D g2d){
        clearCanvas(g2d);
        BufferedImage sun = null;
        try{
            sun = ImageIO.read(getClass().getResource("images/sun.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        AffineTransform original = g2d.getTransform();
        g2d.drawImage(sun, 0, 0, 150, 150, null);
    }

    AffineTransform squish = new AffineTransform();
    public void obtained(Graphics2D g2d, int i){
        clearCanvas(g2d);
        BufferedImage sun = null;
        try{
            sun = ImageIO.read(getClass().getResource("images/sun.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        AffineTransform original = g2d.getTransform();
    
        // g2d.setTransform(original);
        clearCanvas(g2d);
        squish.setToScale(1,1-((i*10)*0.01));
        g2d.transform(squish);
        g2d.drawImage(sun, 0, 0, 150, 150, null);
        clearCanvas(g2d);
        squish.setToRotation(Math.toRadians((i)*10), 50, 50); 
        g2d.transform(squish);
        g2d.drawImage(sun, 0, 0, 150, 150, null);
        sustain(1);  
    }

    public void remove(Graphics2D g2d){
        AffineTransform original = g2d.getTransform();
        g2d.setTransform(original);
        clearCanvas(g2d);
    }
    public static void sustain(long t){
        long finish = (new Date()).getTime() + t;
        while((new Date()).getTime() < finish){
        }
    }
}