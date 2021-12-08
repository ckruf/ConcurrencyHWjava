package threadingHW;
import threadingHW.FirstThread;
import threadingHW.SecondThread;
import threadingHW.ThirdThread;
import threadingHW.FourthThread;

public class RunThreads {

	public static void main(String[] args) {
		FirstThread firstT = new FirstThread();
		Thread a = new Thread(firstT);
		
		SecondThread secondT = new SecondThread();
		Thread b = new Thread(secondT);
		
		ThirdThread thirdT = new ThirdThread();
		Thread c = new Thread(thirdT);
		
		FourthThread fourthT = new FourthThread();
		Thread d = new Thread(fourthT);
		
		a.start();
		b.start();
		c.start();
		d.start();
	}

}
