package cn.jbit.shopping3;
import java.util.Scanner;

public class Deposit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����뱾��");
		double benMoney = input.nextDouble();  //�������뱾��
		System.out.println("����Ϊ��"+benMoney+"\n");
		double a = 2.25*0.01;                        //һ���������
		double b = 2.7*0.01;
		double c = 3.24*0.01;
		double d = 3.6*0.01;
		double num1 = benMoney*a*1;               //���һ�����Ϣ
		double num2 = benMoney*b*2;
		double num3 = benMoney*c*3;
		double num4 = benMoney*d*5;
		double benXin1 = benMoney+num1;           //���һ��ı�Ϣ
		double benXin2 = benMoney+num2;
		double benXin3 = benMoney+num3;
		double benXin4 = benMoney+num4;
		System.out.println("���һ���ı�Ϣ�ǣ�"+benXin1+"\n");
		System.out.println("��������ı�Ϣ�ǣ�"+benXin2+"\n"); 
		System.out.println("��������ı�Ϣ�ǣ�"+benXin3+"\n");
		System.out.println("��������ı�Ϣ�ǣ�"+benXin4+"\n");
	}
}
