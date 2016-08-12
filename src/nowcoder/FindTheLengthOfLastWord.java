package nowcoder;
import java.util.Scanner;
public class FindTheLengthOfLastWord {
	 public static void main(String[] args) { 
         int i;
        // System.out.println("请输入字符串：");  
         Scanner scStr = new Scanner(System.in); //从键盘获取字符串  
         String str = scStr.nextLine();          //将Scanner对象中的内容以字符串的形式取出来  
         char arr[]=str.toCharArray();
         int count=0;
         for( i=arr.length-1;i>=0;i--){
             if(arr[i]!=' ')
                 count++;
             else 
                 break;
         }    
         System.out.println(count);
    }     

}


