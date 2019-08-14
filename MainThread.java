package capgemini.thread;

public class MainThread {
public static void main(String[] args){
	System.out.println("*MainThread ->Started...");
	
	//how to get the handle of main thread.....
	Thread currentThread = Thread.currentThread();
	System.out.println(+currentThread.getId());
	System.out.println(currentThread.getName());
	System.out.println(currentThread.getPriority());
	
	currentThread.setName("MainThread");
	currentThread.setPriority(Thread.MAX_PRIORITY);
	
	System.out.println(currentThread.getName());
	System.out.println(currentThread.getPriority());
	
	for (int index = 0; index < 10; index++) {
		System.out.println(currentThread.getName()+":->"+(index+1));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println("hi, good mornig");
		
	}System.out.println("*MainTread -> ended");
}
}
