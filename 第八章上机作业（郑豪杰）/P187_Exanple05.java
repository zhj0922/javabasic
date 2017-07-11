package cn.jbit.shopping8;

import java.util.Scanner;

public class P187_Exanple05 {
	public static void main(String[] args) {
		int password;
		int money;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			System.out.print("请输入密码：");
			password = input.nextInt();
			if(password == 111111){
				System.out.print("请输入金额：");
				money = input.nextInt();
				for (int j = 0; j < 3; j++){
					if(money >= 0 && money <= 1000 && money % 100 == 0){
						System.out.println("您取了"+money+"元");
						System.out.println("交易完成，请取卡!");
						i = 4;
						break;
					}
					System.out.print("你输入金额的金额不合法，你还有"+(2 - j)+"次机会：");
					money = input.nextInt();
					continue;
				} 
			}
			if(i == 2){
				System.out.println("密码错误，请取卡!");
			}
		}
	}
}
