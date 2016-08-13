package nowcoder;
import java.util.*;
public class MergeRecord {	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int num = in.nextInt();
		while(in.hasNext())
		{
			for (int i=0;i<num;i++)
			{
				int key = in.nextInt();
				int value= in.nextInt();
				if (!map.containsKey(key))
				{
					map.put(key, value);
				}
				else
				{
					int sum=value+map.get(key);
					map.put(key, sum);
				}
			}
			for(Map.Entry<Integer, Integer> entry:map.entrySet())
			{
				System.out.println(entry.getKey() + " " + entry.getValue()); 
			}
		
		}
		
		
		
	}

}
