package nowcoder;
import java.util.Scanner;
public class FindTheLengthOfLastWord {
	 public static void main(String[] args) { 
         int i;
        // System.out.println("�������ַ�����");  
         Scanner scStr = new Scanner(System.in); //�Ӽ��̻�ȡ�ַ���  
         String str = scStr.nextLine();          //��Scanner�����е��������ַ�������ʽȡ����  
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


