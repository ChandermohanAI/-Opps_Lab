import java.util.Arrays;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,u,j;
		int p[] = new int[3];
		int l[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digits between 0-9 of your choice");
		
		for(i=0;i<3;i++)
		{
			System.out.println("Enter digit");
			p[i] = sc.nextInt();
			
		}
		
		for(i=0;i<3;i++)
		{
			l[i] = p[i];
		}
		
		do{
			i=0;
			j=0;
			u = p[i];
			p[i] = p[i+1];
			p[i+1] = u;
			System.out.println(Arrays.toString(p));
		
			u = p[j+1];
			p[j+1] = p[j+2];
			p[j+2] = u;
			System.out.println(Arrays.toString(p));
		}
		while(p[0]!= l[0] && p[1]!= l[1] && p[2]!= l[2]);
}
}

 