package cn.jbit.shopping3;
import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		double num1;           //�����¶�
		double num2;           //���϶�
		System.out.print("�����뻪�϶�����");
		Scanner input = new Scanner(System.in);
		 num1 = input.nextDouble();
		 num2 = 5/9.0*(num1-32);
		 System.out.println("���϶ȣ�"+num2+"��");
		 System.out.print("�����������¶ȣ�");
		 num2 = input.nextDouble();
		 num1 = num2*1.8+32;
		 System.out.println("�����¶ȣ�"+num1+"�H");
	}
}
