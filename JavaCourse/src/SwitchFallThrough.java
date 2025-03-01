
public class SwitchFallThrough {

	public static void main(String[] args) {

		int x = 4; 	// change x value to 0, 1, 2, 3 and see the o/p for each value
		
		switch(x)
		{
			default: 
				System.out.println("Default");
			case 0: 
				System.out.println(0);
				break;
			case 1: 
				System.out.println(1);
			case 2: 
				System.out.println(2);
			case 3: 
				System.out.println(3);
		}
	}

}
