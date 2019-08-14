package capgemini.thread;

public class CreatingMultipleThread {
public static void main(String[] args) {
	System.out.println("Creating Multiple Thread->Started...");
	/*for (int i = 0; i < 10; i++) {
		new Thread("Thread-"+i+":") //Thread name
		{
			public void run(){
				System.out.println(getName()+"running");
			}
		}.start();
		}*/

		
	for (int i = 0; i < 10; i++) {
		Thread thread = new Thread("Thread-"+i+":"){
			public void run(){
				System.out.println(getName()+"running");
			}
		};
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	}
	System.out.println("Creating Multiple Thread->Started...");
}
}
