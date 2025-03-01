
public class ArrayOfArrays3DEx2 {

	public static void main(String[] args) {

		int arr[][][] = { { { 10, 20, 30 }, { 40, 50, 60 }, }, { { 70, 80 }, { 90, 100, 110 } } };
		System.out.println(arr[0][1][2]); 	// 60
		System.out.println(arr[1][0][1]); 	// 80
		System.out.println(arr[2][0][0]); 	// RE
		System.out.println(arr[1][2][0]); 	// RE
		System.out.println(arr[1][1][1]); 	// 100
		System.out.println(arr[2][1][0]);   // RE
	}

}
