package supertomasino;
import java.awt.*;
import java.awt.geom.*;
import java.util.Date;

public class MarioTest {
    public static final Color DARK_YELLOW = new Color(189, 145, 0);
    public static final Color DARK_RED = new Color(255, 0, 0);
    public void draw(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(3));
        Rectangle2D.Double r1 = new Rectangle2D.Double(100, 100, 100, 100);
        g2d.setColor(DARK_YELLOW);
        g2d.fill(r1);
        Rectangle2D.Double r2 = new Rectangle2D.Double(200, 200, 100, 100);
        g2d.setColor(DARK_RED);
        g2d.fill(r2);

        for(int i = 0; i < 60; i++){
            sustain(500);
            g2d.setColor(DARK_YELLOW);
            g2d.fill(r1);
            g2d.setColor(DARK_RED);
            g2d.fill(r2);
            sustain(500);
            g2d.setColor(DARK_RED);
            g2d.fill(r1);
            g2d.setColor(DARK_YELLOW);
            g2d.fill(r2);
        }

    }
public static void sustain(long t){
    long finish = (new Date()).getTime() + t;
    while((new Date()).getTime() < finish){
    }
}
}