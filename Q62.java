package Assginment;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getId() +" Main Started:");
		
		PrintMessage pm = new PrintMessage();
		
		MyRunnable m = new MyRunnable(pm);          //new state
		
		Thread th = new Thread(m);
		
		th.start();                 //ready to runnable
		
	
		try {
			th.join();
		}catch(InterruptedException e) {
			
		}
		
		System.out.println(Thread.currentThread().getId()+ " Main finished");
	}

}
class MyRunnable implements Runnable{
	
	PrintMessage p;
	
	public MyRunnable(PrintMessage p) {
		this.p = p;
	}
	
	@Override
	public void run() {                  //running
		
		System.out.println(Thread.currentThread().getId()+" start");
		
		p.isPrime();
		
		System.out.println(Thread.currentThread().getId()+" finish");
	}              //dead state
}
class PrintMessage{
	
	void isPrime() {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
	int flag=1;
    
	    try
	      {
			for(int i=2;i<n/2;i++) {
			if(n%i ==0) {
				System.out.println("no.is not prime");
				break;
				}
			else {
				System.out.println("no.is prime");
				break;
				}
              
			}
			Thread.sleep(1000);
			
	      }catch(InterruptedException e){
	             System.out.println("Exception"); 
	          }
	      
	}
}