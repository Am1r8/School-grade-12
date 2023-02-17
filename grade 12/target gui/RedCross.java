import java.awt.*;
import javax.swing.*;

/**
 * RedCross class displays a red crosshair on a white background
 * Created by Amirhosein Soleimanian
 * Date: 2023-02-10
 */
public class RedCross extends JPanel {

  /**
   * Override method from JPanel to paint the crosshair on the panel
   * @param g Graphics object used for drawing on the panel
   */
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);  // Call JPanel's paintComponent method to paint the background

    // Calculate the center of the panel
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;

    // Set color to red and draw four rectangles to form the crosshair
    g.setColor(Color.RED);
    g.fillRect(xCenter-5, yCenter, 10, 50);
    g.fillRect(xCenter-5, yCenter-50, 10, 50);
    g.fillRect(xCenter-50, yCenter-5, 50, 10);
    g.fillRect(xCenter, yCenter-5, 50, 10);
  }

  /**
   * The main function creates a window and adds the panel to it.
   * @param args Command line arguments
   */
  public static void main(String[] args) {
    // Create a JFrame window with the title "Red Cross"
    JFrame window = new JFrame("Red Cross");
    window.setBounds(300, 300, 200, 200);  // Set the size of the window
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set the default close operation to exit the program

    // Create an instance of the RedCross panel and set its background to white
    RedCross panel = new RedCross();
    panel.setBackground(Color.WHITE);

    // Add the panel to the content pane of the window
    Container c = window.getContentPane();
    c.add(panel);

    // Make the window visible
    window.setVisible(true);
  }
}
