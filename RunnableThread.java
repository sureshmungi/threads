package capgemini.thread;

public class RunnableThread implements Runnable {
	@Override
	public void run(){
		for (int num = 0; num < 10; num++) {
			System.out.println("\t\t"+Thread.currentThread().getName()+":->"+num);
			try{
				Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
		}
	}
	public static void main(String[] args) {
		System.out.println("RunnableThread ->started...");
		//spawing a runnable instance of a thread
		//Thread(Runnable target)
		Thread runnableThread = new Thread(new RunnableThread());
		
		//instructor JRE to allocate resources and
		//call run method...
		runnableThread.start();
		System.out.println("RunnableThread ->ended...");
		
	}

}
