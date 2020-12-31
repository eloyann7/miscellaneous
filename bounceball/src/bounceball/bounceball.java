package bounceball;

import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class bounceball extends GraphicsProgram
{
	private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final int RADIUS = 30;
    private static final int OFFSET = 2*RADIUS;
	public void run() {
this.resize(WIDTH,HEIGHT);				// size display window
		
		GOval myBall = new GOval(WIDTH/2,0,2*RADIUS,2*RADIUS);
		myBall.setFilled(true);
		myBall.setColor(Color.RED);
		add(myBall);							// create the ball
		pause(1000);	
		int ho = 0;						// initially at top of screen
		int t = 0;						// simulated time
		double height=ho;
		
		while (height < HEIGHT-OFFSET) {
			height = ho + 0.5 * 9.8 * t * t;
// Note the use of the Math.min function to guarantee that the current
// value of height never exceeds the ground plane (remember, y *increases*
// towards the bottom of the screen).
			myBall.setLocation(WIDTH/2,Math.min(height,HEIGHT-OFFSET));
			println("h= "+height);
			pause(100);
			t+=1;
	}

}}

