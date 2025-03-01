
public class SwitchEgThree {

	public static void main(String[] args) {

		int quarter = 4;

		switch (quarter) {
		case 1:
			System.out.println("Q1 -> First Quarter");
			System.out.println("-------------------");
			System.out.println("January");
			System.out.println("February");
			System.out.println("March");
			break;
		case 2:
			System.out.println("Q2 -> Second Quarter");
			System.out.println("--------------------");
			System.out.println("April");
			System.out.println("May");
			System.out.println("June");
			break;
		case 3:
			System.out.println("Q3 -> Third Quarter");
			System.out.println("-------------------");
			System.out.println("July");
			System.out.println("August");
			System.out.println("September");
			break;
		case 4:
			System.out.println("Q4 -> Fourth Quarter");
			System.out.println("--------------------");
			System.out.println("October");
			System.out.println("November");
			System.out.println("December");
			break;
		default:
			System.out.println("Enter valid Quarter number");
		}

	}

}
