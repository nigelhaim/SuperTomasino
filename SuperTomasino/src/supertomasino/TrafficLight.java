
package supertomasino;
import java.awt.*;
import java.awt.geom.*;
public class TrafficLight {

  // Define colors
  private static final Color DARK_YELLOW = new Color(189, 145, 0);
  private static final int STROKE_WIDTH = 3;

  // Define positions for different elements
  private final int leftX;
  private final int rightX;
  private final int topY;
  private final int bottomY;
  private final int lightWidth;
  private final int lightHeight;
  private final int timerWidth;
  private final int timerHeight;
  private final int circleRadius;

  public TrafficLight(int x, int y, int width, int height) {
    this.leftX = x;
    this.rightX = x + width;
    this.topY = y;
    this.bottomY = y + height;
    this.lightWidth = width / 2;
    this.lightHeight = height / 3;
    this.timerWidth = lightWidth;
    this.timerHeight = lightHeight / 3;
    this.circleRadius = lightHeight / 2;
  }

  public void draw(Graphics2D g2d) {
    // Set antialiasing for smoother lines
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.setStroke(new BasicStroke(STROKE_WIDTH));

    // Draw left and right stoplight bases
    g2d.setColor(DARK_YELLOW);
    g2d.fillRect(leftX, topY, lightWidth, lightHeight * 3);
    g2d.fillRect(rightX - lightWidth, topY, lightWidth, lightHeight * 3);
    g2d.setColor(Color.BLACK);
    g2d.drawRect(leftX, topY, lightWidth, lightHeight * 3);
    g2d.drawRect(rightX - lightWidth, topY, lightWidth, lightHeight * 3);

    // Draw timer boxes
    g2d.setColor(DARK_YELLOW);
    g2d.fillRect(leftX, bottomY - timerHeight, timerWidth, timerHeight);
    g2d.fillRect(rightX - timerWidth, bottomY - timerHeight, timerWidth, timerHeight);
    g2d.setColor(Color.BLACK);
    g2d.drawRect(leftX, bottomY - timerHeight, timerWidth, timerHeight);
    g2d.drawRect(rightX - timerWidth, bottomY - timerHeight, timerWidth, timerHeight);

    // Draw traffic light circles
    g2d.setColor(Color.RED);
    g2d.fillOval(leftX + (lightWidth - circleRadius) / 2, topY + lightHeight, circleRadius, circleRadius);
    g2d.fillOval(rightX - lightWidth + (lightWidth - circleRadius) / 2, topY + lightHeight, circleRadius, circleRadius);
    g2d.setColor(Color.YELLOW);
    g2d.fillOval(leftX + (lightWidth - circleRadius) / 2, topY + lightHeight * 2, circleRadius, circleRadius);
    g2d.fillOval(rightX - lightWidth + (lightWidth - circleRadius) / 2, topY + lightHeight * 2, circleRadius, circleRadius);
    g2d.setColor(Color.GREEN);
    g2d.fillOval(leftX + (lightWidth - circleRadius) / 2, topY + lightHeight * 3 - circleRadius, circleRadius, circleRadius);
    g2d.fillOval(rightX - lightWidth + (lightWidth - circleRadius) / 2, topY + lightHeight * 3 - circleRadius, circleRadius, circleRadius);
  }
}