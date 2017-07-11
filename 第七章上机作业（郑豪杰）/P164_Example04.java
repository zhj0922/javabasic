package cn.jbit.shopping7;

import java.util.Scanner;

public class P164_Example04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		System.out.println("请输入10个数");
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
		System.out.println("数字1的个数："+sum);
		System.out.println("数字2的个数："+sum1);
		System.out.println("数字3的个数："+sum2);
		System.out.println("非法字符的个数："+sum3);
	}
}
