package cn.jbit.shopping3;
import java.util.Scanner;

public class RunningMatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������ɼ�(s)��");
		int matchScore = input.nextInt();
		System.out.print("�������Ա�");
		String gender = input.next();
		if (matchScore <= 10) {
			if (gender.equals("��")) {
				System.out.println("��������������");
			} else if(gender.equals("Ů")) {
				System.out.println("��������Ů����");
			} else {
				System.out.println("��������Ա�����");
			}
		}else {
			System.out.println("�㱻��̭��");
		}
	}
}
