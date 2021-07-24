package examples;

interface lenstring1{
	public int lenstr(String s);
}

public class LengthWol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lenstring1 i =s->s.length();
		
		System.out.println("Length of a string "+i.lenstr("Hello"));
	}

}
