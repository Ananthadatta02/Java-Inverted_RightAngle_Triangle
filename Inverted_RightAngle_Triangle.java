package number_patterns;

import java.util.Scanner;

/*
12345
1234
123
12
1		 
*/
public class Inverted_RightAngle_Triangle 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = s.nextInt();
		for(int i=0;i<=n;i++)
		{
			int num = 1;
			for(int j=i;j<n;j++)
			{
				System.out.print(num++);
			}
			System.out.println();
		}
	}
}
