package examples;

interface square1{
	public int m1(int a);
}

public class SquareWoL {

	public static void main(String[] args) {
		
		square1 s =a->a*a;
		
		System.out.println(s.m1(5));
		
		

	}

}
