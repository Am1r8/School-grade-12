import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
    private final Color skyColor = Color.CYAN;

    public Rainbow()
    {
        setBackground(skyColor);
    }

    // Draws the rainbow.


    public static void main(String[] args)
    {
        JFrame w = new JFrame("Rainbow");
        w.setBounds(300, 300, 300, 200);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = w.getContentPane();
        c.add(new Rainbow());
        w.setVisible(true);
    }
}