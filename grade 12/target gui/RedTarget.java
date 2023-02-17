import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @(#)RedTarget.java
 * Created by Amirhosein Soleimanian
 * Date: 2023-02-10
 * About: This program displays a red target on a white background.
 */
public class RedTarget extends JPanel
{
    /**
     * The paintComponent method draws the target.
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); // Call JPanel's paintComponent method to paint the background

        int yCenter = (getHeight() / 8); // Calculate y center position
        int xcenter = (getWidth() / 2) - (yCenter * 3); // Calculate x center position

        // Draw the target
        g.setColor(Color.RED);
        g.fillOval(xcenter, yCenter, yCenter * 6, yCenter * 6);
        g.setColor(Color.WHITE);
        g.fillOval(xcenter + yCenter, yCenter * 2, yCenter * 4, yCenter * 4);
        g.setColor(Color.RED);
        g.fillOval(xcenter + yCenter * 2, yCenter * 3, yCenter * 2, yCenter * 2);
    }

    /**
     * The main function creates a window and adds the panel to it.
     */
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Red Target");
        window.setBounds(300, 300, 200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RedTarget panel = new RedTarget();
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}
