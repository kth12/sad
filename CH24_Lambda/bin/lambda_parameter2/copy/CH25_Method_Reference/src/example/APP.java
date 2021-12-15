package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class APP {
	
	public static void greet() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		ScheduledExecutorService = Executors.newScheduledThreadPool(1);
		
		Service.scheduleAtFixedRate(APP::greet,0,1000,TimeUnit.MILLISECONDS);
	}
}
