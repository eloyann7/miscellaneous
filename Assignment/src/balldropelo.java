import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class balldropelo extends GraphicsProgram {
// setting the size display canvas
private static final int WIDTH = 600;
private static final int HEIGHT = 600;
private static final int OFFSET = 200;
private static final double g=0.8; //gravitational 
private static final double Pi = 3.141592654; //value of pi
private static final double k =0.0016;
private static final double m = 1.0;

//initial values of y and x
private static final double Xinit = 5.0;
//private  final double Yinit = bSize; //ball size is = to 2 times radius
private static final double TICK=0.1;
private static final double ETHR = 0.01; //to stop ball when speed of VY or VX < ethr stop
private static final double XMAX = 100.0;
private static final double YMAX = 100.0;
private static final double PD=1;
private static final double SCALE = HEIGHT/XMAX; 
	
public void run() {
	
	//Code to read simulation parameters from user
	//getting initial velocity input
	double Vo=readDouble ("Enter the initial velocity of the ball in meters/seconds (0,100)");
	
	// getting the launch angle in degrees input
	double theta=readDouble ("Enter the launch angle in degrees (0,90)");
	
	// getting energy loss input
	double loss=readDouble ("Enter energy loss parameter (0,1)");
	
	
	// getting the radius of ball input
	double bSize=readDouble ("Enter the radius of the ball in meters (0.1,5.0)");

           this.resize(WIDTH,HEIGHT);
		
		
		//creating my ball
				GOval Eloball = new GOval (WIDTH/2,0,2*bSize,2*bSize);
				Eloball.setFilled(true);
				Eloball.setColor(Color.pink);
				add(Eloball);
		//initialize variables
		
           double Vt = g/(4*Pi*bSize*bSize*k);
           double Vox=Vo*Math.cos(theta*Pi/180);
           double Voy=Vo*Math.sin(theta*Pi/180);
		//define X and Y and time 
           double X=0.0;
           double Y= bSize;
           int time=0;
           double Vx=Vox;
           double Vy=Voy;
           
           
		//simulation loop
           while(true)  {
           X = Vox*Vt/g*(1-Math.exp(-g*time/Vt));
           Y = bSize + Vt/g*(Voy+Vt)*(1-Math.exp(-g*time/Vt));
           Vx= (X-(Vox*Vt/g*(1-Math.exp(-g*TICK/Vt))))/TICK; 
           Vy= (Y-(bSize + Vt/g*(Voy+Vt)*(1-Math.exp(-g*TICK/Vt))))/TICK; 
           
           double ScrX = (int)((X-bSize)*SCALE);
           
           int ScrY = (int) (HEIGHT-(Y+bSize)*SCALE);
           
        	Eloball.setLocation(ScrX,ScrY);
		// TODO Auto-generated constructor stub
	}

}}
