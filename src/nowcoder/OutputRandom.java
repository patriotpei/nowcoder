package nowcoder;

import java.util.Arrays;
import java.util.Scanner;

public class OutputRandom {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int [] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i]=scan.nextInt();
			}
			Arrays.sort(array);
			System.out.println(array[0]);
			for (int i=1;i<n;i++){
				if (array[i]!=array[i-1])
					System.out.println(array[i]);
			}
				
		}
		
	} 
}
//��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹���
//�������ü����������N��1��1000֮������������N��1000�������������ظ�������
//��ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�
//Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ��ͬѧ�����顣
//����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ����� 
//������У���������������ĸ�������������Ӧ����������
//���ض��У������Ľ��