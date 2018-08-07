
public class Autobox5 {

	public static void main(String args[]) {
		Boolean b = true;
		
		if(b) System.out.println("b is true");
		
		Character ch = 'x';
		char ch2 = ch; //unbox the Character
		
		System.out.println("ch2 is " + ch);
	}
}
