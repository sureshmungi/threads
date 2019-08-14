package capgemini.thread;

public class TableThread {
	public static void main(String[] args) {
		new TablePrint(1).start();
		new TablePrint(10).start();
		new TablePrint(100).start();
	}
}

class TablePrint extends Thread{
	int startTable;
	public TablePrint(int startTable){
		this.startTable=startTable;
	}
	@Override
	public void run(){
		for(int num=1; num<=10; num++){
			System.out.println(startTable*num);
			try {
				Thread.sleep(1000);
			} catch ( InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
}
