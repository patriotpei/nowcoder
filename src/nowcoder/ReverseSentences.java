package nowcoder;

import java.util.Scanner;

public class ReverseSentences {
	public static void main(String[] args) 
	 {
		 Scanner scan = new Scanner(System.in);
			while (scan.hasNext()) 
			{
				String[] ss = new String[20];
				String str = scan.nextLine();
				ss=str.split(" ");
				int len=ss.length;
				//System.out.print(len);
				for (int i=len-1;i>=0;i--)
				{
					if (i>0){
						System.out.print(ss[i]+" ");	
					}

					else {
						System.out.print(ss[i]);
					}
				}
			}
	 }

}
