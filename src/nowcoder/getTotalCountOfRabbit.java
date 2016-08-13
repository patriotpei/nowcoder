package nowcoder;

import java.util.Scanner;

public class getTotalCountOfRabbit {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			if (n<=2)
				System.out.println("1");
			else {
				int before2=0;
				int before1=1;
				int total=0;
				for (int i=2;i<=n;i++){
				    total=before1+before2;
					before2=before1;
					before1=total;
				}
				System.out.println(total);
			}
			
		}
		
		
		
	}
}
