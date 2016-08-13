package nowcoder;

//import java.util.Scanner;
import java.util.*;
public class StringSplit {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String s1 = new String();
			for (int i=0;i<2;i++){
				String str1 = scan.nextLine();				
				if (str1.length()%8!=0){
					str1=str1+"00000000";
				}
				for(int j=0;j<str1.length()/8;j++){
					s1+= (str1.substring(j*8, (j + 1)*8) + " ");
				}							
			}		
			String ss[] =s1.split(" ");
			for (int j=0;j<ss.length;j++){
				System.out.println(ss[j]);
			}

		}			
	}
}
//连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
//长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
//连续输入字符串(输入2次,每个字符串长度小于100)
//输出到长度为8的新字符串数组