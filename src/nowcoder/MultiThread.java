package nowcoder;

import java.util.Scanner;

public class MultiThread {
	public static void main(String[] args) 
	{
	  Scanner in = new  Scanner(System.in);
	  while (in.hasNext()) 
	  {
		  int N=in.nextInt();
		  StringBuilder res= new StringBuilder();
		  for (int i=N;i>0;i--)
		  {
			  res.append("ABCD");
		  }
		  System.out.println(res.toString());
	
	  }
	}

}
