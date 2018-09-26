package test;

import java.util.Timer;
import java.util.TimerTask;

public class test2 {

	static int count=0;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();				
		TimerTask task = new TimerTask() {			
			public void run() {				
				doWork();								 
			}					
			private void doWork() {
				// TODO Auto-generated method stub
				System.out.println("123"+count);
				count++;
				if(count>2) {
					System.gc();
		            cancel();
				}
			}
		
		};
		timer.schedule(task, 1000, 1000);
       }
}
	


