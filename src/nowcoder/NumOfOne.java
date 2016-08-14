package nowcoder;

import java.util.*;

public class NumOfOne{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while(n>0){
            if((n&1)>0){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
}
