import java.util.Scanner;

public class hhello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,count=0;
		for(i=40;i<250;i++)
		{
			if(i%5 == 0)
			{
				count=count+i;
			}
		}
		System.out.println("Total Sum is:");
		System.out.println(count);
	}

}
