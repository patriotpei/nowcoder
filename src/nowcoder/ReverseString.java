package nowcoder;

import java.util.Scanner;

public class ReverseString {
	 public static void main(String[] args) 
	 {
		 Scanner scan = new Scanner(System.in);
			while (scan.hasNext()) 
			{
				String str = scan.nextLine();
				char []array=str.toCharArray();
				int len = str.length();
				for (int i=len-1;i>=0;i--)
				{
					System.out.print(array[i]);
				}
			}
	 }

}
