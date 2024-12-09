package supertomasino;
import java.awt.*;
import java.awt.geom.*;
import java.util.Date;

public class SuperTomasinoChar {
    public static final Color RED = new Color(255, 0, 0);
    public static final Color GRAY = new Color(124, 124, 124);
    public static final Color BLACK = new Color(0, 0, 0);
    public static final Color skin = new Color(255, 153, 0);
    public static final Color transparent = new Color(0, 0, 0, 0f);

    private void clearCanvas(Graphics2D g2d) {
        g2d.setColor(Color.WHITE); // Or whatever your background color is
        g2d.fillRect(0, 0, 800, 600); // Replace 800 and 600 with your actual canvas dimensions
    }

    public static void FirstFrame(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(3));
        Rectangle2D.Double r1 = new Rectangle2D.Double(100, 100, 100, 100);
        g2d.setColor(RED);
        g2d.fill(r1);
    };
    public static void SecondFrame(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(3));
        Rectangle2D.Double r2 = new Rectangle2D.Double(200, 200, 100, 100);
        g2d.setColor(GRAY);
        g2d.fill(r2);
    };
    public static void ThirdFrame(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(3));
        Rectangle2D.Double r3 = new Rectangle2D.Double(300, 300, 100, 100);
        g2d.setColor(BLACK);
        g2d.fill(r3);
    };
    public void Walk(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(3));

        for(int i = 0; i < 60; i++){
            sustain(500);
            clearCanvas(g2d);
            FirstFrame(g2d);
            sustain(500);
            clearCanvas(g2d);
            SecondFrame(g2d);
            sustain(500);
            clearCanvas(g2d);
            ThirdFrame(g2d);
            sustain(500);
        }

    }
    public static void sustain(long t){
        long finish = (new Date()).getTime() + t;
        while((new Date()).getTime() < finish){
        }
    }
}