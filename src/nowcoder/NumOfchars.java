package nowcoder;

import java.util.Scanner;
import java.util.TreeMap;

public class NumOfchars {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		while(in.hasNext())
		{
			String str = in.nextLine();
			str = str.toLowerCase();
			char []arr=str.toCharArray();
			int len=arr.length;
			for (int i=0;i<len;i++)
			{
				char key=arr[i];
				map.put(key, 0);
			}
			System.out.println(map.size());
		}
	}
	
}
