package cn.jbit.shopping7;

import java.util.Scanner;

public class P154_Example05 {
	public static void main(String[] args) {
		int[] price = new int[4];
		Scanner input = new Scanner(System.in);
		System.out.println("请输入4家店的价格");
		for(int i = 0; i < price.length; i++){
			System.out.print("第"+(i+1)+"家店的价格：");
			price[i] = input.nextInt();
			}
		int min = price[0];
		for(int i = 0; i < price.length; i++){
			if(price[i] < min){
				min = price[i];
			}
		}
		System.out.println("最低价格是："+min);
	}
}
