import java.util.Scanner;

public class ReverseADigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int rem;
		int rev = 0;

		while (n > 0) {
			rem = n % 10; 
            rev = (rev * 10) + rem; 
            n = n / 10;		
		}
		System.out.print(rev);
	}

}
