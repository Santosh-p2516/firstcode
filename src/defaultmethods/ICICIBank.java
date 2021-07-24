package defaultmethods;



interface RBI{
	
	
	default void AadharCardImp() {
		System.out.println("Adhar card implementaon");
	}
	
	default void m1() {
		System.out.println("m1 implementaon");
	}
}

public class ICICIBank implements RBI {

	public static void main(String[] args) {
		
		RBI i = new ICICIBank();
		i.AadharCardImp();
		i.m1();
		
	

	}

}
