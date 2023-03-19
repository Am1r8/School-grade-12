import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Wages extends JFrame
    implements ActionListener
{
private JTextField inputHours, inputRate, display;
private DecimalFormat money = new DecimalFormat("$0.00");

// Constructor to create and set up the GUI components
public Wages()
{
    super("Wages Calculator");

    // Create a panel with a grid layout
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3,2));

    // Add labels and text fields for input
    panel.add(new JLabel("   Hours worked:"));
    inputHours = new JTextField(5);
    inputHours.setHorizontalAlignment(JTextField.RIGHT);
    panel.add(inputHours);

    panel.add(new JLabel("   Hourly rate:"));
    inputRate = new JTextField(5);
    inputRate.setHorizontalAlignment(JTextField.RIGHT);
    panel.add(inputRate);

    // Add label and text field to display output
    panel.add(new JLabel("   Total wages:"));
    display = new JTextField(20);
    display.setHorizontalAlignment(JTextField.RIGHT);
    display.setEditable(false);
    display.setBackground(Color.yellow);
    panel.add(display);

    // Add a button to calculate the wages
    JButton calc = new JButton("Calculate wages");
    calc.addActionListener(this);

    // Add the components to the content pane
    Container c = getContentPane();
    c.add(panel, BorderLayout.CENTER);
    c.add(calc, BorderLayout.SOUTH);
}

// Method to calculate the total wages
public double totalWages(double hours, double rate)
{
    double wages;

    // Calculate wages for hours worked
    if(hours <= 40) {
        wages = hours * rate;
    } else {
        wages = 40 * rate + (hours - 40) * (1.5 * rate);
    }

    return wages;
}

// Action listener method for the calculate button
public void actionPerformed(ActionEvent e)
{
    // Get input values and calculate total wages
    String s = inputHours.getText();
    double hours = Double.parseDouble(s);
    s = inputRate.getText();
    double rate = Double.parseDouble(s);
    double wages = totalWages(hours, rate);

    // Display the total wages in the text field
    display.setText(money.format(wages));
}

// Main method to create and display the GUI window
public static void main(String[] args)
{
    Wages window = new Wages();
    window.setBounds(300, 300, 200, 150);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
}
}
