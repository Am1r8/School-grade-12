import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class PacerTest extends JPanel
{
  private Image leftShoe, rightShoe, fLeftShoe, fRightShoe;

  // Constructor
  public PacerTest()
  {
    leftShoe = (new ImageIcon("grade 12/chapt3/leftshoe.gif")).getImage();
    rightShoe = (new ImageIcon("grade 12/chapt3/rightshoe.gif")).getImage();
    fLeftShoe = (new ImageIcon("grade 12/chapt3/leftsandal.gif")).getImage();
    fRightShoe = (new ImageIcon("grade 12/chapt3/rightsandal.gif")).getImage();
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = 500;
    int y = 100;
    int fy = 300;
    int stepLength = 100;

    Pacer bob = new Pacer(x, y, leftShoe, rightShoe);

      bob.turnAround();
      bob.draw(g);
      bob.firstStep();
      bob.nextStep();
      bob.stop();
      bob.draw(g);
      bob.firstStep();
      bob.nextStep();
      bob.stop();
      bob.draw(g);
      bob.firstStep();
      bob.nextStep();
      bob.stop();
      bob.draw(g);

    Pacer bob2 = new Pacer(x + 150, 340, leftShoe, rightShoe);

      bob2.turnLeft();
      bob2.draw(g);

    Pacer bob3 = new Pacer(x + 300, 160, leftShoe, rightShoe);

      bob3.turnRight();
      bob3.draw(g);

    Pacer bob4 = new Pacer(x + 315, 370, leftShoe, rightShoe);

      bob4.turnLeft();
      bob4.turnLeft();
      bob4.draw(g);

    Pacer bob5 = new Pacer(x + 130, 130, leftShoe, rightShoe);

      bob5.turnRight();
      bob5.turnLeft();
      bob5.draw(g);

    /* bobertta = new Walker(x, fy, fLeftShoe, fRightShoe);

      bobertta.draw(g);
      bobertta.firstStep();
      bobertta.nextStep();
      bobertta.stop();
      bobertta.draw(g);
      bobertta.firstStep();
      bobertta.nextStep();
      bobertta.firstStep();
      bobertta.nextStep();
      bobertta.firstStep();
      bobertta.stop();
      bobertta.draw(g);
      */

    // Draw a cursor at the expected center of the first "shoe":
    //g.drawLine(x - 50, y, x + 50, y);
    //g.drawLine(x, y - 50, x, y + 50);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Feet");
    window.setBounds(100, 100, 1000, 500);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    PacerTest panel = new PacerTest();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}