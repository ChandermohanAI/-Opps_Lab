import java.util.Scanner;

public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,q,j;
		int x[] = new int[10];
		int b[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			System.out.println("Enter marks of student no :"+(i+1));
			x[i] = sc.nextInt();
		}
		
		for(i=0;i<10;i++)
		{
			System.out.println("marks of student no "+(i+1)+" are "+x[i]+"\n");
		}
		
		System.out.println("\n");
		for(i=0;i<10;i++)
		{
			b[i]=x[i];
		}	
		
		for(i=0;i<10;i++)
		{
			for(j=0;j<10;j++)
			{
				if(x[i]<x[j])
				{
					q = x[i];
					x[i] = x[j];
					x[j] = q;
				}
			}
		}
		System.out.printf("\n");
		
		System.out.printf("Marks of students in ascending order\n");
		
		for(i=0;i<10;i++)
		{
			for(j=0;j<10;j++)
			{
				if(x[i] == b[j])
				{
					if(x[i]<50 && x[i]>40)
						{
						System.out.println("Student no "+(j+1)+" with marks "+x[i]+"(Pass)"+"\n");
						}
						
					else if(x[i]<75 && x[i]>51)
					{
						System.out.println("Student no "+(j+1)+" with marks "+x[i]+"(Merit)"+"\n");
					}
					
					else if(x[i]>75)
					{
						System.out.println("Student no "+(j+1)+" with marks "+x[i]+"(Distinction)"+"\n");
					}
					
				}
			}
		}
}
}
