package cn.jbit.shopping3;
import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		double num1;           //华氏温度
		double num2;           //摄氏度
		System.out.print("请输入华氏度数：");
		Scanner input = new Scanner(System.in);
		 num1 = input.nextDouble();
		 num2 = 5/9.0*(num1-32);
		 System.out.println("摄氏度："+num2+"℃");
		 System.out.print("请输入摄氏温度：");
		 num2 = input.nextDouble();
		 num1 = num2*1.8+32;
		 System.out.println("华氏温度："+num1+"℉");
	}
}
