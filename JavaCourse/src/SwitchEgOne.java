
public class SwitchEgOne {

	public static void main(String[] args) {
		    
		char operator = '/';
		
		int a = 10, b = 20;
		
		switch(operator)
		{
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(b / a);
			break;
		default:
			System.out.println("No operator found");
		}

	}

}
