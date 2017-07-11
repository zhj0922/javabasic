package cn.jbit.shopping8;

import java.util.Scanner;

public class P184_Example06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		for(int i = 0; i < 3; i++){
			System.out.println("请输入第"+(i+1)+"个人所购得三件商品的价格：");
			for(int j = 0;j < 3; j++){
				double price = input.nextDouble();
				if(price >= 300){
					count++;
				}
			}
			System.out.println("第"+(i+1)+"个人共有"+count+"件商品享受8折优惠!");
			count = 0;
		}
	}
}
