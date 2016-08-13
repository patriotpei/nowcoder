package nowcoder;

import java.util.Scanner;

public class ApproximationValue {
	public static void main(String[] args)
	{ 
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			float num=in.nextFloat();
			//int num0=(int)(num+0.5);
			System.out.println((int)(num+0.5));
		}		
		
	}
}
