package cn.jbit.shopping3;
import java.util.Scanner;
public class Demo_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dole;
		System.out.println("�������ǰ���е�ֽ�ƣ�");
		System.out.print("�����е�ֽ�ƣ�");
		int zuo = input.nextInt();
		System.out.print("�����е�ֽ�ƣ�");
		int you = input.nextInt();
		System.out.println("************");
		
		dole = zuo;
		zuo = you;
		you = dole;
		System.out.println("������������е�ֽ�ƣ�");
		System.out.println("�����е�ֽ�ƣ�"+zuo);
		System.out.println("�����е�ֽ�ƣ�"+you);
		
	}
}
