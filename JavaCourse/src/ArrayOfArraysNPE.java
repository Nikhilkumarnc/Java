
public class ArrayOfArraysNPE {

	public static void main(String[] args) {
		
		// Refer image(ArrayOfArraysNPE.PNG) to understand well.
		int[][] x = new int[2][];
		System.out.println(x); 	// [[I@3b94d659
		System.out.println(x[0]);  // null
		System.out.println("x[0][0]: " + x[0][0]); 	// Cannot load from int array because "x[0]" is null
		
	}

}
