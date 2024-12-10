package supertomasino;

import java.awt.*;
import java.awt.geom.*;
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

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        // MarioTest marioTest = new MarioTest();
        // marioTest.draw(g2d);
        AffineTransform translate = new AffineTransform();
        translate.setToTranslation(10, 100);

        // Get the original location 
        AffineTransform original = g2d.getTransform();

        // Apply the transformation
        g2d.transform(translate);
        SuperTomasinoChar stc = new SuperTomasinoChar();
        stc.Walk(g2d);


    }
    public static void main(String[] args) {
        // TODO code application logic here
        SuperTomasino st = new SuperTomasino();
        st.setSize(1000,1000);
        st.setTitle("Super Tomasino | Nigel Haim N. Sebastian");
        st.setVisible(true);
    }
    
}
