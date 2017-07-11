package cn.jbit.shopping4;

import java.util.*;

public class P91_No5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0.0 ;
		System.out.println("请输入第一个操作数：");
		if (input.hasNextDouble() == true) {
			double num1 = input.nextDouble();
			System.out.println("请输入第二个操作数：");
			if (input.hasNextDouble() == true){
					double num2 = input.nextDouble();
					System.out.println("请输入运算符(+ - * / )");
					char num3 = input.next().charAt(0);
					switch(num3){
					case '+':
						sum = num1 + num2;
						break;
					case '-':
						sum = num1 - num2;
						break;
					case '*':
						sum = num1 * num2;
						break;
					case '/':
					if(num2 == 0 ){
						System.out.println("除数不能为零");
					}else{
						sum = num1 / num2;
					}
						break;
					}
					System.out.println("计算结果："+num1+num3+num2+"="+sum);
				}else {
					System.out.println("请输入正确的数字！");
				}
			}else {
			System.out.println("请输入正确的数字！");
		}
	}
}
