package cn.jbit.shopping7;

import java.util.Scanner;

public class P148_Example02 {
	public static void main(String[] args) {
		double[] money = new double[5];
		double sum = 0;
		System.out.println("�������Ա���µ����Ѽ�¼");
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < money.length; i++){
			System.out.print("�������"+(i+1)+"�ʹ�����:");
			money[i] = input.nextDouble();
			sum = sum + money[i];
		}
		System.out.println("\n���\t\t\t���(Ԫ)");
		for (int i = 0; i < money.length; i++) {
			System.out.println((i+1)+"\t\t\t"+money[i]);
		}
		System.out.println("�ܽ��\t\t\t"+sum);
	}
}
