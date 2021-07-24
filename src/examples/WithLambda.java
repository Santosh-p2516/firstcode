package examples;
@FunctionalInterface
interface interf1{
	public void m1();
	
}

public class WithLambda {

	public static void main(String[] args) {
		interf1 i=()->System.out.println("Hello java");
		i.m1();
	}

}
