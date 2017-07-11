package cn.jbit.shopping7;

import java.util.Scanner;

public class P148_Example02 {
	public static void main(String[] args) {
		double[] money = new double[5];
		double sum = 0;
		System.out.println("请输入会员本月的消费记录");
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < money.length; i++){
			System.out.print("请输入第"+(i+1)+"笔购物金额:");
			money[i] = input.nextDouble();
			sum = sum + money[i];
		}
		System.out.println("\n序号\t\t\t金额(元)");
		for (int i = 0; i < money.length; i++) {
			System.out.println((i+1)+"\t\t\t"+money[i]);
		}
		System.out.println("总金额\t\t\t"+sum);
	}
}
