package nowcoder;
import java.util.*;
public class GetIntNoRepeat {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) 
		{
			int num =scan.nextInt();
			int result=0;
			int[] a=new int[10];
			while(num>0)
			{
				if(a[num%10]==0)
				{
					a[num%10]=1;
					result=result*10+num%10;
				}
				num=num/10;
			}
			System.out.print(result);		
		}
	}

}
