package supertomasino;
import java.awt.*;
import java.awt.geom.*;
import java.util.Date;

public class SuperTomasinoChar {
    public static final Color RED = new Color(255, 0, 0);
    public static final Color GRAY = new Color(124, 124, 124);
    public static final Color BLACK = new Color(0, 0, 0);
    public static final Color skin = new Color(255, 153, 0);
    public static final Color D_WHITE = new Color(255, 236, 212);
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

        //FrontHand
        GeneralPath FrontHand = new GeneralPath();
        FrontHand.moveTo(313, 284);
        FrontHand.lineTo(353, 284);
        FrontHand.lineTo(353, 248);
        FrontHand.lineTo(381, 248);
        FrontHand.lineTo(381, 284);
        FrontHand.lineTo(412, 284);
        FrontHand.lineTo(412, 312);
        FrontHand.lineTo(381, 312);
        FrontHand.lineTo(381, 344);
        FrontHand.lineTo(313, 344);
        FrontHand.closePath();
        g2d.setColor(skin);
        g2d.fill(FrontHand);

        //BackHand
        GeneralPath BackHand = new GeneralPath();
        BackHand.moveTo(130, 285);
        BackHand.lineTo(104, 285);
        BackHand.lineTo(104, 314);  
        BackHand.lineTo(71, 314);
        BackHand.lineTo(71, 345);
        BackHand.lineTo(130, 345);
        BackHand.closePath();
        g2d.setColor(skin);
        g2d.fill(BackHand);


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

        //Polo 
        Rectangle2D.Double Polo = new Rectangle2D.Double(130, 248, 135, 96);
        g2d.setColor(D_WHITE);
        g2d.fill(Polo);
        Rectangle2D.Double SleeveRed = new Rectangle2D.Double(265, 248, 24, 96);
        g2d.setColor(RED); 
        g2d.fill(SleeveRed);
        Rectangle2D.Double SleeveGray = new Rectangle2D.Double(289, 248, 24, 96);
        g2d.setColor(GRAY);
        g2d.fill(SleeveGray);

        //Pants
        GeneralPath Pants = new GeneralPath();
        Pants.moveTo(130, 315);
        Pants.lineTo(161, 315);
        Pants.lineTo(161, 344);
        Pants.lineTo(161, 346);
        Pants.lineTo(348, 346);
        Pants.lineTo(348, 404);
        Pants.lineTo(316, 404);
        Pants.lineTo(316, 437);
        Pants.lineTo(228, 437);
        Pants.lineTo(228, 404);
        Pants.lineTo(196, 404);
        Pants.lineTo(196, 437);
        Pants.lineTo(104, 437);
        Pants.lineTo(104, 377);
        Pants.lineTo(130, 377);
        Pants.closePath();
        g2d.setColor(BLACK);
        g2d.fill(Pants);

        //Shoes
        GeneralPath ShoesBack = new GeneralPath();
        ShoesBack.moveTo(130, 345); 
        ShoesBack.lineTo(130, 377);
        ShoesBack.lineTo(104, 377);
        ShoesBack.lineTo(104, 437);
        ShoesBack.lineTo(67, 437);  
        ShoesBack.lineTo(67, 467);
        ShoesBack.lineTo(41, 467);
        ShoesBack.lineTo(41, 410);
        ShoesBack.lineTo(71, 410);
        ShoesBack.lineTo(71, 345);
        ShoesBack.closePath();
        g2d.setColor(GRAY);
        g2d.fill(ShoesBack);

        GeneralPath ShoesFront = new GeneralPath();
        ShoesFront.moveTo(228, 437);
        ShoesFront.lineTo(286, 437);
        ShoesFront.lineTo(286, 472);
        ShoesFront.lineTo(316, 472);
        ShoesFront.lineTo(316, 438);
        ShoesFront.lineTo(316, 497);
        ShoesFront.lineTo(198, 497);    
        ShoesFront.lineTo(198, 437);
        ShoesFront.closePath(); 
        g2d.setColor(GRAY);
        g2d.fill(ShoesFront);

    };
    public static void SecondFrame(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(3));
        //Head 
        Rectangle2D.Double Skin1_f2 = new Rectangle2D.Double(148, 63, 186, 156);
        g2d.setColor(skin);
        g2d.fill(Skin1_f2);

        Rectangle2D.Double Skin2_f2 = new Rectangle2D.Double(117, 98, 35, 59);
        g2d.setColor(skin);
        g2d.fill(Skin2_f2);

        //Nose
        GeneralPath Nose_f2 = new GeneralPath();
        Nose_f2.moveTo(334, 63);
        Nose_f2.lineTo(334, 96);
        Nose_f2.lineTo(395, 96);
        Nose_f2.lineTo(395, 127);
        Nose_f2.lineTo(426, 127);
        Nose_f2.lineTo(426, 156);
        Nose_f2.lineTo(395, 156);
        Nose_f2.lineTo(395, 186);   
        Nose_f2.lineTo(364, 186);
        Nose_f2.lineTo(364, 218);  
        Nose_f2.lineTo(334, 218); 
        Nose_f2.closePath();
        g2d.setColor(skin);
        g2d.fill(Nose_f2);
        
        //BackHand
        Rectangle2D.Double BackHand_f2 = new Rectangle2D.Double(332, 281, 31, 34);
        g2d.setColor(skin);
        g2d.fill(BackHand_f2);


        //Hat 
        GeneralPath Hat_f2 = new GeneralPath();
        Hat_f2.moveTo(148, 1);
        Hat_f2.lineTo(301, 1);
        Hat_f2.lineTo(301, 34);
        Hat_f2.lineTo(394, 34);
        Hat_f2.lineTo(394, 63); 
        Hat_f2.lineTo(117, 63);
        Hat_f2.lineTo(117, 34);
        Hat_f2.lineTo(117, 34);
        Hat_f2.lineTo(148, 34);
        Hat_f2.closePath();
        g2d.setColor(RED);
        g2d.fill(Hat_f2);

        //SideBurn
        GeneralPath SideBurn_f2 = new GeneralPath();
        SideBurn_f2.moveTo(117, 63);
        SideBurn_f2.lineTo(117, 63);
        SideBurn_f2.lineTo(117, 98);
        SideBurn_f2.lineTo(148, 98);
        SideBurn_f2.lineTo(148, 158);
        SideBurn_f2.lineTo(208, 158);
        SideBurn_f2.lineTo(208, 128);
        SideBurn_f2.lineTo(177, 128);
        SideBurn_f2.lineTo(177, 98);
        SideBurn_f2.lineTo(208, 98);
        SideBurn_f2.lineTo(208, 63);
        SideBurn_f2.closePath();
        g2d.setColor(BLACK);
        g2d.fill(SideBurn_f2);
        
        //BackBurn  
        GeneralPath BackBurn_f2 = new GeneralPath();
        BackBurn_f2.moveTo(117, 98);
        BackBurn_f2.lineTo(117, 157);
        BackBurn_f2.lineTo(148, 157);
        BackBurn_f2.lineTo(148, 185);   
        BackBurn_f2.lineTo(90, 185);
        BackBurn_f2.lineTo(90, 98);
        BackBurn_f2.closePath();
        g2d.setColor(BLACK);
        g2d.fill(BackBurn_f2);

        //Eye
        Rectangle2D.Double Eye1_f2 = new Rectangle2D.Double(273, 63, 29, 61);
        g2d.setColor(BLACK);   
        g2d.fill(Eye1_f2);

        //Beard
        GeneralPath Beard_f2 = new GeneralPath();
        Beard_f2.moveTo(301, 127);  
        Beard_f2.lineTo(334, 127);
        Beard_f2.lineTo(334, 156);
        Beard_f2.lineTo(395, 156);
        Beard_f2.lineTo(395, 186);
        Beard_f2.lineTo(273, 186);
        Beard_f2.lineTo(273, 156);
        Beard_f2.lineTo(301, 156);
        Beard_f2.closePath();
        g2d.setColor(BLACK);
        g2d.fill(Beard_f2);


        //Polo
        GeneralPath Polo_f2 = new GeneralPath();   
        Polo_f2.moveTo(117, 219);
        Polo_f2.lineTo(117, 252);
        Polo_f2.lineTo(87, 252);
        Polo_f2.lineTo(87, 283);
        Polo_f2.lineTo(178, 283);
        Polo_f2.lineTo(178, 344);
        Polo_f2.lineTo(274, 344);
        Polo_f2.lineTo(274, 377);
        Polo_f2.lineTo(243, 377);
        Polo_f2.lineTo(243, 408);
        Polo_f2.lineTo(333, 408);
        Polo_f2.lineTo(333, 375);
        Polo_f2.lineTo(363, 375);
        Polo_f2.lineTo(363, 300);
        Polo_f2.lineTo(288, 300);
        Polo_f2.lineTo(288, 253);
        Polo_f2.lineTo(301, 253);
        Polo_f2.lineTo(301, 219);
        Polo_f2.closePath();
        g2d.setColor(D_WHITE);
        g2d.fill(Polo_f2);

        Rectangle2D.Double SleeveRed_Right_f2 = new Rectangle2D.Double(288, 252, 67, 25);
        g2d.setColor(RED);
        g2d.fill(SleeveRed_Right_f2);
        Rectangle2D.Double SleeveGray_Right_f2 = new Rectangle2D.Double(288, 277, 67, 27);
        g2d.setColor(GRAY);
        g2d.fill(SleeveGray_Right_f2);


        Rectangle2D.Double SleeveRed_Left_f2 = new Rectangle2D.Double(87, 283, 91, 28);
        g2d.setColor(RED);
        g2d.fill(SleeveRed_Left_f2);
        Rectangle2D.Double SleeveGray_Left_f2 = new Rectangle2D.Double(87, 311, 91, 33);    
        g2d.setColor(GRAY);
        g2d.fill(SleeveGray_Left_f2);

        //FrontHand
        GeneralPath FrontHand_f2 = new GeneralPath();
        FrontHand_f2.moveTo(87, 344);
        FrontHand_f2.lineTo(273, 344);
        FrontHand_f2.lineTo(273, 377);
        FrontHand_f2.lineTo(242, 377);
        FrontHand_f2.lineTo(242, 408);
        FrontHand_f2.lineTo(145, 408);
        FrontHand_f2.lineTo(145, 377);
        FrontHand_f2.lineTo(87, 377);
        FrontHand_f2.closePath();
        g2d.setColor(skin);
        g2d.fill(FrontHand_f2);

        //Pants
        Rectangle2D.Double Pants_f2 = new Rectangle2D.Double(117, 377, 28, 31);
        g2d.setColor(BLACK);
        g2d.fill(Pants_f2);
        Rectangle2D.Double Pants_f2_2 = new Rectangle2D.Double(145, 408, 188, 28);
        g2d.setColor(BLACK);
        g2d.fill(Pants_f2_2);

        //Shoes
        GeneralPath ShoesBack_f2 = new GeneralPath();
        ShoesBack_f2.moveTo(145, 436);
        ShoesBack_f2.lineTo(364, 436);
        ShoesBack_f2.lineTo(364, 467);
        ShoesBack_f2.lineTo(270, 467);
        ShoesBack_f2.lineTo(270, 498);
        ShoesBack_f2.lineTo(145, 498);
        ShoesBack_f2.closePath();
        g2d.setColor(GRAY);
        g2d.fill(ShoesBack_f2);

    };
    public static void ThirdFrame(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(3));
        //Head
        Rectangle2D.Double Skin1_f3 = new Rectangle2D.Double(159, 63, 186, 155);
        g2d.setColor(skin);
        g2d.fill(Skin1_f3);
        Rectangle2D.Double Skin2_f3 = new Rectangle2D.Double(128, 96, 35, 65);
        g2d.setColor(skin);
        g2d.fill(Skin2_f3);

        //Nose 
        GeneralPath Nose_f3 = new GeneralPath();
        Nose_f3.moveTo(345, 63);
        Nose_f3.lineTo(345, 96);
        Nose_f3.lineTo(406, 96);
        Nose_f3.lineTo(406, 127);
        Nose_f3.lineTo(437, 127);
        Nose_f3.lineTo(437, 156);
        Nose_f3.lineTo(405, 156);
        Nose_f3.lineTo(405, 186);
        Nose_f3.lineTo(374, 186);
        Nose_f3.lineTo(374, 218);
        Nose_f3.lineTo(345, 218);
        Nose_f3.closePath();
        g2d.setColor(skin);
        g2d.fill(Nose_f3);

        //BackHand  
        GeneralPath BackHand_f3 = new GeneralPath();
        BackHand_f3.moveTo(68, 250);
        BackHand_f3.lineTo(5, 253);
        BackHand_f3.lineTo(5, 340);
        BackHand_f3.lineTo(61, 340);
        BackHand_f3.lineTo(61, 312);
        BackHand_f3.lineTo(96, 312);
        BackHand_f3.lineTo(96, 281);
        BackHand_f3.closePath();
        g2d.setColor(skin);
        g2d.fill(BackHand_f3);

        //FrontHand 
        Rectangle2D.Double FrontHand_f3 = new Rectangle2D.Double(344, 251, 121, 58);
        g2d.setColor(skin);
        g2d.fill(FrontHand_f3);


        //Hat
        GeneralPath Hat_f3 = new GeneralPath();
        Hat_f3.moveTo(159, 3);
        Hat_f3.lineTo(311, 3);
        Hat_f3.lineTo(311, 34);
        Hat_f3.lineTo(405, 34);
        Hat_f3.lineTo(405, 63);
        Hat_f3.lineTo(128, 63);
        Hat_f3.lineTo(128, 34);
        Hat_f3.lineTo(159, 34);
        Hat_f3.closePath();
        g2d.setColor(RED);
        g2d.fill(Hat_f3);

        //SideBurn
        GeneralPath SideBurn_f3 = new GeneralPath();
        SideBurn_f3.moveTo(128, 63);
        SideBurn_f3.lineTo(128, 96);
        SideBurn_f3.lineTo(159, 96);
        SideBurn_f3.lineTo(159, 158);
        SideBurn_f3.lineTo(219, 158);
        SideBurn_f3.lineTo(219, 128);
        SideBurn_f3.lineTo(188, 128);
        SideBurn_f3.lineTo(188, 96);
        SideBurn_f3.lineTo(219, 96);
        SideBurn_f3.lineTo(219, 63);
        SideBurn_f3.closePath();
        g2d.setColor(BLACK);
        g2d.fill(SideBurn_f3);


        //BackBurn
        GeneralPath BackBurn_f3 = new GeneralPath();
        BackBurn_f3.moveTo(128, 96);
        BackBurn_f3.lineTo(97, 97);
        BackBurn_f3.lineTo(97, 187);    
        BackBurn_f3.lineTo(159, 187);
        BackBurn_f3.lineTo(159, 158);
        BackBurn_f3.lineTo(128, 158);
        BackBurn_f3.closePath();
        g2d.setColor(BLACK);
        g2d.fill(BackBurn_f3);

        //Eye
        Rectangle2D.Double Eye1_f3 = new Rectangle2D.Double(281, 63, 29, 61);
        g2d.setColor(BLACK);
        g2d.fill(Eye1_f3);

        //Beard
        GeneralPath Beard_f3 = new GeneralPath();
        Beard_f3.moveTo(311, 127);
        Beard_f3.lineTo(345, 127);
        Beard_f3.lineTo(345, 156);
        Beard_f3.lineTo(406, 156);
        Beard_f3.lineTo(406, 186);
        Beard_f3.lineTo(281, 186);
        Beard_f3.lineTo(281, 156);
        Beard_f3.lineTo(311, 156);
        Beard_f3.closePath();
        g2d.setColor(BLACK);
        g2d.fill(Beard_f3);

        //Polo
        GeneralPath Polo_f3 = new GeneralPath();
        Polo_f3.moveTo(124, 218);
        Polo_f3.lineTo(124, 343);
        Polo_f3.lineTo(344, 342);
        Polo_f3.lineTo(344, 309);
        Polo_f3.lineTo(284, 309);
        Polo_f3.lineTo(284, 251);
        Polo_f3.lineTo(313, 251);
        Polo_f3.lineTo(313, 218);
        Polo_f3.closePath();
        g2d.setColor(D_WHITE);
        g2d.fill(Polo_f3);

        Rectangle2D.Double SleeveRed_Right_f3 = new Rectangle2D.Double(284, 251, 29, 58);
        g2d.setColor(RED);
        g2d.fill(SleeveRed_Right_f3);
        Rectangle2D.Double SleeveGray_Right_f3 = new Rectangle2D.Double(313, 251, 31, 58);
        g2d.setColor(GRAY);
        g2d.fill(SleeveGray_Right_f3);

        Rectangle2D.Double SleeveRed_Left_f3 = new Rectangle2D.Double(96, 218, 28, 62);
        g2d.setColor(RED);
        g2d.fill(SleeveRed_Left_f3);
        Rectangle2D.Double SleeveGray_Left_f3 = new Rectangle2D.Double(68, 218, 28, 62);
        g2d.setColor(GRAY);
        g2d.fill(SleeveGray_Left_f3);

        //Pants
        GeneralPath Pants_f3 = new GeneralPath();
        Pants_f3.moveTo(124, 343);
        Pants_f3.lineTo(375, 343);
        Pants_f3.lineTo(375, 408);
        Pants_f3.lineTo(375, 436);
        Pants_f3.lineTo(284, 436);
        Pants_f3.lineTo(284, 404);
        Pants_f3.lineTo(187, 404);
        Pants_f3.lineTo(187, 436);
        Pants_f3.lineTo(96, 436);
        Pants_f3.lineTo(96, 406);
        Pants_f3.lineTo(65, 406);
        Pants_f3.lineTo(65, 378); 
        Pants_f3.lineTo(96, 378);
        Pants_f3.lineTo(96, 343);
        Pants_f3.closePath();
        g2d.setColor(BLACK);
        g2d.fill(Pants_f3);

        //Shoes 
        GeneralPath ShoesBack_f3 = new GeneralPath();
        ShoesBack_f3.moveTo(96, 406);
        ShoesBack_f3.lineTo(35, 406);
        ShoesBack_f3.lineTo(35, 465);
        ShoesBack_f3.lineTo(65, 465);
        ShoesBack_f3.lineTo(65, 497);
        ShoesBack_f3.lineTo(154, 497);
        ShoesBack_f3.lineTo(154, 472);
        ShoesBack_f3.lineTo(124, 472);
        ShoesBack_f3.lineTo(124, 436);
        ShoesBack_f3.lineTo(96, 436);
        ShoesBack_f3.closePath();
        g2d.setColor(GRAY);
        g2d.fill(ShoesBack_f3);

        GeneralPath ShoesFront_f3 = new GeneralPath();    
        ShoesFront_f3.moveTo(375, 343);
        ShoesFront_f3.lineTo(410, 343);
        ShoesFront_f3.lineTo(410, 309);
        ShoesFront_f3.lineTo(436, 309);
        ShoesFront_f3.lineTo(436, 436);
        ShoesFront_f3.lineTo(375, 436);
        ShoesFront_f3.closePath();
        g2d.setColor(GRAY);
        g2d.fill(ShoesFront_f3);



    };
    public void Walk(Graphics2D g2d){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(3));

        for(int i = 0; i < 100000; i++){
            clearCanvas(g2d);
            FirstFrame(g2d);
            sustain(100);
            clearCanvas(g2d);
            SecondFrame(g2d);
            sustain(100); 
            clearCanvas(g2d);
            ThirdFrame(g2d);
            sustain(100);
        }

    }
    public static void sustain(long t){
        long finish = (new Date()).getTime() + t;
        while((new Date()).getTime() < finish){
        }
    }
}