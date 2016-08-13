package nowcoder;

import java.util.Scanner;

public class Primefactors {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int num=in.nextInt();
			if (num>1)
			{
				for (int i=2;i<=num;i++)
				{
					while (num%i==0)
					{
						System.out.print(i+" ");
						num=num/i;
					}
				
				}
	
			}
		}
	}
}
