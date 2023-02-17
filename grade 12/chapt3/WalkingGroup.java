import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WalkingGroup implements StudentGroup
{
  private Walker amy;
  private Walker cat;
  private Walker ben;
  private Image leftWomansShoe, rightWomansShoe;
  private Image leftMansShoe, rightMansShoe;
  private Image leftpaw, rightpaw;

  private DanceFloor danceFloor;

  private enum State {READY, MOVING, STOPPED}
  private State currentState;
  private int stepsCount;

  // Constructor
  public WalkingGroup(DanceFloor df)
  {
    danceFloor = df;
    leftWomansShoe = (new ImageIcon("grade 12/chapt3/leftsandal.gif")).getImage();
    rightWomansShoe = (new ImageIcon("grade 12/chapt3/rightsandal.gif")).getImage();
    leftMansShoe = (new ImageIcon("grade 12/chapt3/leftshoe.gif")).getImage();
    rightMansShoe = (new ImageIcon("grade 12/chapt3/rightshoe.gif")).getImage();
    leftpaw = (new ImageIcon("grade 12/chapt3/leftpaw.gif")).getImage();
    rightpaw = (new ImageIcon("grade 12/chapt3/rightpaw.gif")).getImage();
  }

  // Sets up this group of participants
  public void setup(int floorDir, Dance steps1, Dance steps2)
  {
    int width = danceFloor.getWidth();
    int height = danceFloor.getHeight();
    int x = width / 10;
    int y = height / 2;

    if (floorDir == 0)
    {
      amy = new Walker(x, y - height / 5, leftWomansShoe, rightWomansShoe);
      cat = new Walker(x, y, leftpaw, rightpaw);
      ben = new Walker(x, y + height / 5, leftMansShoe, rightMansShoe);
    }
    else
    {
      amy = new Walker(x, y + height / 5, leftWomansShoe, rightWomansShoe);
      cat = new Walker(x, y, leftpaw, rightpaw);
      ben = new Walker(x, y - height / 5, leftMansShoe, rightMansShoe);
    }
    currentState = State.READY;
    danceFloor.update(this);
  }

  // Moves the group by one step
  public void makeNextStep()
  {
    if (currentState == State.READY)
    {
      amy.firstStep();
      cat.firstStep();
      ben.firstStep();
      currentState = State.MOVING;
      stepsCount = 0;
    }
    else if (currentState == State.MOVING)
    {
      if (amy.distanceTraveled() <= danceFloor.getWidth() * 3 / 4)
      {
        amy.nextStep();
        cat.nextStep();
        ben.nextStep();
        stepsCount++;
      }
      else
      {
        amy.stop();
        cat.stop();
        ben.stop();
        currentState = State.STOPPED;
      }
    }

    danceFloor.update(this);
  }

  // Draws this group
  public void draw(Graphics g)
  {
    amy.draw(g);
    cat.draw(g);
    ben.draw(g);
  }
}
