package cn.jbit.shopping4;

import java.util.*;

public class P91_No5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0.0 ;
		System.out.println("�������һ����������");
		if (input.hasNextDouble() == true) {
			double num1 = input.nextDouble();
			System.out.println("������ڶ�����������");
			if (input.hasNextDouble() == true){
					double num2 = input.nextDouble();
					System.out.println("�����������(+ - * / )");
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
						System.out.println("��������Ϊ��");
					}else{
						sum = num1 / num2;
					}
						break;
					}
					System.out.println("��������"+num1+num3+num2+"="+sum);
				}else {
					System.out.println("��������ȷ�����֣�");
				}
			}else {
			System.out.println("��������ȷ�����֣�");
		}
	}
}
