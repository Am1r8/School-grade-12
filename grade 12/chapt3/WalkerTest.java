import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class WalkerTest extends JPanel
{
  private Image leftShoe, rightShoe, fLeftShoe, fRightShoe;

  // Constructor
  public WalkerTest()
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

    int x = 50;
    int y = 100;
    int fy = 300;
    int stepLength = 100;

    Walker bob = new Walker(x, y, leftShoe, rightShoe);

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

    Walker bobertta = new Walker(x, fy, fLeftShoe, fRightShoe);

      bobertta.draw(g);
      bobertta.firstStep();
      bobertta.nextStep();
      bobertta.stop();
      bobertta.draw(g);
      bobertta.firstStep();
      bobertta.nextStep();
      bobertta.nextStep();
      bobertta.nextStep();
      bobertta.stop();
      bobertta.draw(g);

    // Draw a cursor at the expected center of the first "shoe":
    //g.drawLine(x - 50, y, x + 50, y);
    //g.drawLine(x, y - 50, x, y + 50);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Feet");
    window.setBounds(100, 100, 1000, 500);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    WalkerTest panel = new WalkerTest();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}