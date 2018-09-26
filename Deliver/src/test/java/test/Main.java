package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.scheduling.config.Task;

public class Main {

	public static void main(String[] args) {

		Timer timer = new Timer();
		timer.schedule(new MyTask(), 1000, 2000);
	}
}

	class MyTask extends TimerTask {
		@Override
		public void run() {
		System.out.println("dddd");
		 
		}
	}

