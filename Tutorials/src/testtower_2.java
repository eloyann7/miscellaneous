import acm.program.*;
public class testtower_2 extends ConsoleProgram{

	public static final int NUMBERTOWERS=100; // FINAL IS USEFUL FOR CONSTANCE
	 public void run ()
	 {SignalTower start = null;
	 SignalTower end = null;
	 
	 for(Integer i=0; i<NUMBERTOWERS; i++) {
	SignalTower myTower=new SignalTower("Tower" + i.toString(), null, this);
	 
	if(start==null) {
	
		
		
		
		start=myTower;
		
				end=myTower;
	}
	else
	{
	end.nextTower=myTower;
	end=myTower;
	
	
	 }
		 
		 
		 
		 
	 }
	
	 
	 start.signal();
	 
   }
}

