package cn.jbit.shopping5;
import java.util.Scanner;

public class P98_No5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�ϸ�����(y/n)��");
		String answer = input.next();
		while(answer.contentEquals("n")){
			System.out.println("�����Ķ��̳�!\n�����ϻ����!\n");
			System.out.print("�ϸ�����(y/n)��");
			answer = input.next();
		}
		System.out.println("���ѧϰ����!");
	}
}
