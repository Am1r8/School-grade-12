import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rps extends JFrame
    implements ActionListener
{
// Array of moves (rock, paper, scissors)
private final char moves[] = {'R', 'P', 'S'};
// Radio buttons for user input
private JRadioButton rock, paper, scissors;
// Text field to display game results
private JTextField display;

// Constructor
public Rps()
{
    super("Rock, paper, Scissors");

    // Create radio buttons for each move
    rock = new JRadioButton("   Rock   ", true);
    paper = new JRadioButton("   Paper  ");
    scissors = new JRadioButton(" Scissors ");

    // Group radio buttons so only one can be selected at a time
    ButtonGroup rpsButtons = new ButtonGroup();
    rpsButtons.add(rock);
    rpsButtons.add(paper);
    rpsButtons.add(scissors);

    // Create a "Go" button to start the game
    JButton go = new JButton("         Go         ");
    go.addActionListener(this);

    // Create a text field to display game results
    display = new JTextField(25);
    display.setEditable(false);
    display.setBackground(Color.yellow);

    // Add all components to the content pane
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(rock);
    c.add(paper);
    c.add(scissors);
    c.add(go);
    c.add(display);
}

/**
 *  returns -1 if the player wins,
 *  0 if it's a tie, and 1 if the computer wins
 */
private int nextPlay(char computerMove, char playerMove)
{
    // Determine game outcome based on computer and player moves
    switch(computerMove){
    case 'R':
        switch(playerMove){
        case 'R':
            return 0;
        case 'P':
            return -1;
        case 'S':
            return 1;
        }
    case 'P':
        switch(playerMove){
        case 'R':
            return 1;
        case 'P':
            return 0;
        case 'S':
            return -1;
        }
    case 'S':
        switch(playerMove){
        case 'R':
            return -1;
        case 'P':
            return 1;
        case 'S':
            return 0;
        }
    }
    return 0;
}

// Handle button clicks
public void actionPerformed(ActionEvent e)
{
    char playerMove, computerMove;
    if (rock.isSelected())
    playerMove = 'R';
    else if (paper.isSelected())
    playerMove = 'P';
    else // if (scissors.isSelected())
    playerMove = 'S';

    // Choose a random move for the computer
    int k = (int)(Math.random() * 3);
    computerMove = moves[k];
    // Determine the game outcome
    int result = nextPlay(computerMove, playerMove);

    // Display the game results in the text field
    String msg = "  You said " + makeWord(playerMove) + ", I said " +
                makeWord(computerMove);
    if (result < 0)
    msg += " -- you win.";
    else if (result == 0)
    msg += " -- tie.";
    else // if (result > 0)
    msg += " -- I win.";
    display.setText(msg);
}

private String makeWord(char move)
{
    String word = "";

    switch (move)
    {
    case 'R': word = "ROCK"; break;
    case 'P': word = "PAPER"; break;
    case 'S': word = "SCISSORS"; break;
    }
    return word;
}

public static void main(String[] args)
{
    Rps window = new Rps();
    window.setBounds(300, 300, 300, 140);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
}
}