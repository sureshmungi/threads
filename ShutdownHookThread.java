package capgemini.thread;

public class ShutdownHookThread {
	public static void main(String[] args) throws Exception {
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new ShutdownHook());
		System.out.println("Now main sleeping....press ctrl+c to exit");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		
	}

}
class ShutdownHook extends Thread{
	public void run(){
		System.out.println("ShutdownHook TASK is completed");
	}
}
