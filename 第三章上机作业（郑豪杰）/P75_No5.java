package cn.jbit.shopping3;

import java.util.*;

public class P75_No5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��ɺɺͬѧ��Java�ɼ���");
		if (input.hasNextInt()) {
			int score = input.nextInt();
			int num = score / 10;
			switch (num) {
			case 10:
				System.out.println("���׸���������");
				break;
			case 9:
				System.out.println("ĸ�׸�����һ���ʼǱ�����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("ĸ�׸������ֻ�");
				break;
			default:
				System.out.println("û������");
				break;
			}
		} else {
			System.out.println("��������ȷ������");
		}
	}
}
