package cn.jbit.shopping3;
import java.util.Scanner;

public class P74_NO1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������û�����");
		char name = input.next().charAt(0);
		System.out.print("���������룺");
		int score = input.nextInt();
		if ((name == '��') && (score == 123) ) {
			System.out.println("��ӭ�㣬��");
		}else {
			System.out.println("�Բ����㲻����");
		}
	}
}
 