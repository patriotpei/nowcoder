package nowcoder;

import java.math.BigInteger;
import java.util.Scanner;

public class Sodabottles {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) 
		{
			int num = scan.nextInt();
			if (num>0)
			{
				int n = num/2;
				System.out.println(n);
			}
		}
	} 
}

