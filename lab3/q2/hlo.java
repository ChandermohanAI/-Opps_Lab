import java.util.Scanner;

public class hlo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int x[] = new int[10];
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			System.out.println("Enter digit");
			x[i] = sc.nextInt();
			
		}
		
		for(i=0;i<10;i++)
		{
			System.out.println("Number u enter is:");
			System.out.println(x[i]);
			System.out.println("And the square is:");
			System.out.println(x[i]*x[i]);
		}
		
	}

}
