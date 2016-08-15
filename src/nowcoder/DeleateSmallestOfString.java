package nowcoder;
import java.util.Scanner;
public class DeleateSmallestOfString {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String string=in.nextLine();
			char[] array=string.toCharArray();
			int len=array.length;
			int []a=new int[26];
			for(int i=0;i<len;i++)
			{
				a[array[i]-'a']++;
				//System.out.println(array[i]-'a');
			}
			int min=a[array[0]-'a'];
			for(int i=0;i<len;i++)
			{
				if(a[array[i]-'a']<=min)
					min=a[array[i]-'a'];
			}
			for(int i=0;i<len;i++)
			{
				if(a[array[i]-'a']>min){
					System.out.print(array[i]);
					
				}			
				
			}
			System.out.println();
		
		}
	}
}
