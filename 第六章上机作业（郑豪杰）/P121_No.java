package cn.jbit.shopping6;
import java.util.Scanner;

public class P121_No {
	public static void main(String[] args) {
		int i,j;
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��ֵ��");
		int num = input.nextInt();
		System.out.println("�������ֵ�����������³˷���");
		for(i = 0,j = num; i <= num; i++,j--){
			System.out.println(i+  "*" + j+  "=" +  (i*j));
		}
	}
}
