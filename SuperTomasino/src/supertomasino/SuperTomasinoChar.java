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
        g2d.fillRect(0, 0, 469, 503); // Replace 800 and 600 with your actual canvas dimensions
    }

    public static void FirstFrame(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(3));
        //Head
        Rectangle2D.Double Skin1 = new Rectangle2D.Double(134, 125, 31, 65);
        g2d.setColor(skin);
        g2d.fill(Skin1);

        Rectangle2D.Double Skin2 = new Rectangle2D.Double(163, 96, 186, 152);
        g2d.setColor(skin);
        g2d.fill(Skin2);

        GeneralPath Nose = new GeneralPath();
        Nose.moveTo(349, 127);
        Nose.lineTo(412, 127);
        Nose.lineTo(412, 158);
        Nose.lineTo(443, 158);
        Nose.lineTo(443, 190);
        Nose.lineTo(412, 190);
        Nose.lineTo(412, 218);
        Nose.lineTo(381, 218);
        Nose.lineTo(381, 248);
        Nose.lineTo(349, 248);
        Nose.closePath();
        g2d.setColor(skin);
        g2d.fill(Nose);

        //Hat
        GeneralPath Hat = new GeneralPath();
        Hat.moveTo(162, 32);
        Hat.lineTo(319, 32);
        Hat.lineTo(319, 63);
        Hat.lineTo(412, 63);
        Hat.lineTo(412, 96);
        Hat.lineTo(134, 96);
        Hat.lineTo(134, 64);
        Hat.lineTo(162, 64);
        Hat.closePath();
        g2d.setColor(RED);
        g2d.fill(Hat);

        //SideBurn
        GeneralPath SideBurn = new GeneralPath();
        SideBurn.moveTo(134, 96);
        SideBurn.lineTo(224, 96);
        SideBurn.lineTo(224, 125);
        SideBurn.lineTo(193, 125);
        SideBurn.lineTo(193, 158);
        SideBurn.lineTo(224, 158);
        SideBurn.lineTo(224, 186);
        SideBurn.lineTo(163, 186);
        SideBurn.lineTo(163, 125);
        SideBurn.lineTo(134, 125);
        SideBurn.closePath();
        g2d.setColor(BLACK);
        g2d.fill(SideBurn);

        //BackBurn
        GeneralPath BackBurn = new GeneralPath();
        BackBurn.moveTo(134, 125);
        BackBurn.lineTo(163, 125);
        BackBurn.lineTo(104, 127);
        BackBurn.lineTo(104, 218);
        BackBurn.lineTo(165, 218);
        BackBurn.lineTo(165, 190);
        BackBurn.lineTo(134, 190);
        BackBurn.closePath();
        g2d.setColor(BLACK);
        g2d.fill(BackBurn);

        //Eye
        Rectangle2D.Double Eye1 = new Rectangle2D.Double(289, 96, 29, 61);
        g2d.setColor(BLACK);
        g2d.fill(Eye1);

        //Beard 
        GeneralPath Beard = new GeneralPath();
        Beard.moveTo(318, 157);
        Beard.lineTo(350, 157);
        Beard.lineTo(350, 190);
        Beard.lineTo(412, 190);
        Beard.lineTo(412, 218);
        Beard.lineTo(289, 218);
        Beard.lineTo(289, 190);
        Beard.lineTo(318, 190);
        Beard.closePath();
        g2d.setColor(BLACK);
        g2d.fill(Beard);


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
            // sustain(500);
            // clearCanvas(g2d);
            FirstFrame(g2d);
            // sustain(500);
            // clearCanvas(g2d);
            // SecondFrame(g2d);
            // sustain(500);
            // clearCanvas(g2d);
            // ThirdFrame(g2d);
            // sustain(500);
        }

    }
    public static void sustain(long t){
        long finish = (new Date()).getTime() + t;
        while((new Date()).getTime() < finish){
        }
    }
}