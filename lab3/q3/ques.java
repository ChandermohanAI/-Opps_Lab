import java.util.Scanner;

public class ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter digits between 1-12 of your choice");
			a = sc.nextInt();
			
			switch(a)
			{
			case 1:
				System.out.println("January\n");
				break;
			case(2):
				System.out.println("Feburary\n");
				break;
			case(3):
				System.out.println("March\n");
				break;
			case(4):
				System.out.println("April\n");
				break;
			case(5):
				System.out.println("May\n");
				break;
			case(6):
				System.out.println("June\n");
				break;
			case(7):
				System.out.println("July\n");
				break;
			case(8):
				System.out.println("August\n");
				break;
			case(9):
				System.out.println("September\n");
				break;
			case(10):
				System.out.println("October\n");
				break;
			case(11):
				System.out.println("November\n");
				break;
			case(12):
				System.out.println("December\n");
				break;
			default:
				System.out.println("Invalid input");
		}
		
		}while(true);
}
}
