package cn.jbit.shopping7;

import java.util.Scanner;

public class P164_Example04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		System.out.println("������10����");
		int[]  num = new int[10];
		for(int i = 0; i < num.length; i++){
			num[i] = input.nextInt();
			switch(num[i]){
			case 1:
				sum++;
				break;
			case 2:
				sum1++;
				break;
			case 3:
				sum2++;
				break;
			default:
				sum3++;
				break;
			}
		}
		System.out.println("����1�ĸ�����"+sum);
		System.out.println("����2�ĸ�����"+sum1);
		System.out.println("����3�ĸ�����"+sum2);
		System.out.println("�Ƿ��ַ��ĸ�����"+sum3);
	}
}
