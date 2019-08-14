package capgemini.thread;

public class CommunicationInterThread {
public static void main(String[] args) {
	
	System.out.println("CommunicationInterThread is Started...");
	Account account = new Account();
	new Thread(){
		public void run(){
			account.withdraw(15000);
			
		}
	}.start();
	new Thread(){
		public void run(){
			account.deposit(10000);
			
		}
}.start();
System.out.println("CommunicationInterThread is ended...");;
}
}
class Account{
	int amount = 10000;
	synchronized void withdraw(int amount){
		System.out.println("going to withdraw..");
		if (this.amount<amount) {
			System.out.println("less balance; waiting for deposit...");
	try {
		wait();
	} catch (Exception e) {
		
	}		
		}
		this.amount -=amount;
		System.out.println("withdraw is completed....");
	}
	
	synchronized void deposit(int amount){
		System.out.println("going to deposit..");
		if (this.amount<amount) {
			System.out.println("less balance; waiting for deposit...");
	
		this.amount +=amount;
		System.out.println("deposit is completed....");
		notify();
	}
}
}