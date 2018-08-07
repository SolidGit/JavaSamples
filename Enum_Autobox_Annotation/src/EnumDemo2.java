enum Apple3 {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}


public class EnumDemo2 
{
	public static void main(String args[]) 
	{
		Apple3 ap;
		
		System.out.println("Here are all the apple constants:");
		
		Apple3 allapples [] = Apple3.values();
		for(Apple3 a : allapples)
			System.out.println(a);
		
		System.out.println();
		
		ap = Apple3.valueOf("Winesap");
		System.out.println("ap contains: " + ap);
		
	}
}
