
public class LengthVariableVSLengthMethod {

	public static void main(String[] args) {

		int x[] = new int [6];
		System.out.println(x.length); 	// 6
//		System.out.println(x.length()); 	 error
		
		String s = "Hello";
		System.out.println(s.length()); 	// 5
//		System.out.println(s.length);  // Error
		
		String[] s2 = {"A", "AA", "AAA"};
		System.out.println(s2.length); 	// 3
//		System.out.println(s2[0].length); 	// CE
		System.out.println(s2[1].length()); // 2
//		System.out.println(s2[2].length); 	// CE
		
		int[][] arr2 = new int[6][3];
		System.out.println(x.length); 	// 6
//		System.out.println(x[0].length); // CE
	}

}
