package examples;

public class MultiTreadingWL {

	public static void main(String[] args) {
		
		Runnable r=()->{
			
			//prog1
			for(int i=1;i<=10;i++)
			{
				System.out.println("child Thread....");
			}
		
		};
		
		Thread t= new Thread(r);
		t.start();
		
		//prog2
		
		for (int i=1;i<=10;i++) {
			
			System.out.println("Main Thread...");
		}
	}
	
}


