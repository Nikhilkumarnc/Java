
public class Array1DEg1 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40 ,50};
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		for(int x: arr)
		{
			System.out.print(x + " ");
		}

	}

}
