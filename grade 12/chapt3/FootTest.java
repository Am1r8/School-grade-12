import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class FootTest extends JPanel
{
  private Image shoe;

  // Constructor
  public FootTest()
  {
    shoe = (new ImageIcon("grade 12/chapt3/leftshoe.gif")).getImage();
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = 50;
    int y = 100;
    int stepLength = 100;

    Foot foot = new Foot(x, y, shoe);

      foot.turn(270);
      foot.draw(g);
      foot.moveSideways(stepLength);
      foot.draw(g);
      foot.moveSideways(stepLength);
      foot.draw(g);
      foot.moveSideways(stepLength);
      foot.draw(g);
      foot.turn(0);
      foot.moveSideways(200);
      foot.moveForward(-50);
      foot.draw(g);
      foot.moveSideways(100);
      foot.draw(g);
      foot.turn(90);
      foot.moveSideways(-50);
      foot.moveForward(-50);
      foot.draw(g);
      foot.moveSideways(100);
      foot.draw(g);
      foot.moveSideways(200);
      foot.moveForward(-540);
      foot.turn(180);
      foot.draw(g);
      foot.moveForward(-100);
      foot.draw(g);
      foot.moveForward(-100);
      foot.draw(g);
      foot.moveForward(-100);
      foot.draw(g);

    // Draw a cursor at the expected center of the first "shoe":
    //g.drawLine(x - 50, y, x + 50, y);
    //g.drawLine(x, y - 50, x, y + 50);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Feet");
    window.setBounds(100, 100, 1000, 500);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    FootTest panel = new FootTest();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}