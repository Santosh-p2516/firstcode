package examples;

public class MultiThredaing implements Runnable {
	
	public void run() {
		for (int i=1;i<=10;i++);
		System.out.println("child Thread...");
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiThredaing r= new MultiThredaing();
		
		Thread t= new Thread(r);
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread");
		}

	}

	
	
}
