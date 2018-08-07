enum Apple{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo 
{
	public static void main(String args[]) 
	{
		Apple ap;
		ap = Apple.RedDel;
		
		System.out.println(ap);
		System.out.println();
		
		ap = Apple.GoldenDel;
		
		if(ap == Apple.GoldenDel) System.out.println("ap contains GOldenDel. \n");
		
		switch(ap) {
			case Jonathan:
				System.out.println(ap +" is red");
				break;
			case GoldenDel:
				System.out.println(ap + " is yellow");
				break;
			case RedDel:
				System.out.println(ap +" is red");
				break;
			case Winesap:
				System.out.println(ap +" is red");
				break;
			case Cortland:
				System.out.println(ap +" is red");
				break;
		}
	}
}
