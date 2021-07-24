package examples;



@FunctionalInterface
interface intef{
	public void m1();
}

class Demo implements intef{
	public void m1() {
	System.out.println("Hello java");
	
	
}
}


public class WithooutLamda {
	
	public static void main (String [] args)  {
		
		intef i = new Demo();
		i.m1();


	}
}
