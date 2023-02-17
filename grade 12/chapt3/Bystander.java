import java.awt.Image;

public class Bystander extends Walker{

	private int stepsCount;


	public Bystander(int x, int y, Image leftPic, Image rightPic) {
		super(x, y, leftPic, rightPic);

	}

	public void firstStep()
	  {
		Foot leftFoot = getLeftFoot();
		leftFoot.turn(-45);
	    stepsCount = 1;
	  }
	public void nextStep()
	  {
		Foot leftFoot = getLeftFoot();
		if (stepsCount % 2 == 0)  // if stepsCount is even
			leftFoot.turn(-45);
	    else
	    	leftFoot.turn(45);
	    stepsCount++;  // increment by 1
	  }

	public void stop()
	  {

		Foot leftFoot = getLeftFoot();
		if (stepsCount % 2 != 0)
			leftFoot.turn(45);

	  }
	public int distanceTraveled()
	  {
	    return 0;
	  }


}
