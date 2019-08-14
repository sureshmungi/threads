package capgemini.thread;

public class ThreeThread {
	public static void main(String[] args) {
		new OneTable().start();
		new TwoTable().start();
		new ThreeTable().start();
		
	}
}
class  OneTable extends Thread{
	@Override
	public void run(){
		int startTable=1;
		for (int num = 1; num <10; num++) 
			System.out.println(startTable*num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
			
		}
	}
	
	class  TwoTable extends Thread{
		@Override
		public void run(){
			int startTable=10;
			for (int num = 1; num <10; num++) 
				System.out.println(startTable*num);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
				}
				
			}
		}
	
		class  ThreeTable extends Thread{
			@Override
			public void run(){
				int startTable=100;
				for (int num = 1; num <=10; num++) 
					System.out.println(startTable*num);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
						
					}
					
				}
			}
