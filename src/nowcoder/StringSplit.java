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
//���������ַ������밴����Ϊ8���ÿ���ַ�����������µ��ַ������飻
//���Ȳ���8���������ַ������ں��油����0�����ַ���������
//���������ַ���(����2��,ÿ���ַ�������С��100)
//���������Ϊ8�����ַ�������