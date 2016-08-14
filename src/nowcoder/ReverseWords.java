package nowcoder;

import java.util.*; 

public class ReverseWords {
	public static void main(String[] args) 
	 {
		 Scanner scan = new Scanner(System.in);
			while (scan.hasNext()) 
			{
				String[] ss = new String[20];
				String str = scan.nextLine();
				System.out.println(str);
				ss=str.split(" |#|!|\\*|\\$");
				int len=ss.length;
				if(ss[0].equals(""))
				{
					//System.out.println("111111");
					for (int i=len-1;i>=1;i--)
					{
						if (i>1){
							System.out.print(ss[i]+" ");	
						}
						else{
							System.out.print(ss[i]);
						}
					}
				}
				else {
					//System.out.println("2222");
					for (int i=len-1;i>=0;i--)
					{
						if (i>0){
							System.out.print(ss[i]+" ");	
						}
						else{
							System.out.print(ss[i]);
						}
					}
				}

				
			}
	 }

}
