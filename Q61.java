import java.util.*;

public class ThreadPattern {

	public static void main(String[] args) {
		
		Thread t1 = new NewThread();
		
		t1.start();
		
	}

}
class NewThread extends Thread{
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	@Override
	public void run() {
		
		for(int i=0;i<n;i++) {
			try {
			t1.sleep(1000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println("*");
		}
	}
}