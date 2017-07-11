package cn.jbit.shopping3;
import java.util.Scanner;

public class Deposit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入本金：");
		double benMoney = input.nextDouble();  //键盘输入本金
		System.out.println("本金为："+benMoney+"\n");
		double a = 2.25*0.01;                        //一年的年利率
		double b = 2.7*0.01;
		double c = 3.24*0.01;
		double d = 3.6*0.01;
		double num1 = benMoney*a*1;               //存款一年的利息
		double num2 = benMoney*b*2;
		double num3 = benMoney*c*3;
		double num4 = benMoney*d*5;
		double benXin1 = benMoney+num1;           //存款一年的本息
		double benXin2 = benMoney+num2;
		double benXin3 = benMoney+num3;
		double benXin4 = benMoney+num4;
		System.out.println("存款一年后的本息是："+benXin1+"\n");
		System.out.println("存款两年后的本息是："+benXin2+"\n"); 
		System.out.println("存款三年后的本息是："+benXin3+"\n");
		System.out.println("存款五年后的本息是："+benXin4+"\n");
	}
}
