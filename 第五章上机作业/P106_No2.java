package cn.jbit.shopping5;

import java.util.*;

public class P106_No2 {
	public static void main(String[] args) {
		System.out.println("MyShopping管理系统 > 购物结算\n");
		System.out.println("* * * * * * * * * * * * * * * * *\n");
		System.out.println("请选择购买的商品编号：\n 1.T恤\t   2.网球鞋\t  3.网球拍");
		System.out.println("* * * * * * * * * * * * * * * * * * *\t");
		Scanner input = new Scanner(System.in);

		String answer = ""; // 判断是否继续（y/n）
		String name;
		double price;
		int goodsNo;
		do {
			System.out.print("请输入商品编号：");
			if(input.hasNextInt() == true){
			goodsNo = input.nextInt();
		
			switch (goodsNo) {
			case 1:
				System.out.println("T恤\t ￥245.0\t");

				break;
			case 2:
				System.out.println("网球鞋\t ￥570.0\t");

				break;
			case 3:
				System.out.println("网球拍\t ￥320.0\t");

				break;
				default:
					while(goodsNo > 3){
					System.out.print("您输入的数字有误，请重新输入：");
					goodsNo = input.nextInt();
					}
					switch (goodsNo) {
					case 1:
						System.out.println("T恤\t ￥245.0\n");

						break;
					case 2:
						System.out.println("网球鞋\t ￥570.0\n");

						break;
					case 3:
						System.out.println("网球拍\t ￥320.0\n");

						break;
					}
			}
			}else{
		
				System.out.print("请输入正确的数字：");
				goodsNo = input.nextInt();
				while(input.hasNextInt() == true){
					System.out.print("请输入正确的数字：");
					goodsNo = input.nextInt();
				}
				switch (goodsNo) {
				case 1:
					System.out.println("T恤\t ￥245.0\n");

					break;
				case 2:
					System.out.println("网球鞋\t ￥570.0\n");

					break;
				case 3:
					System.out.println("网球拍\t ￥320.0\n");

					break;
				}
			}
			System.out.print("是否继续(y/n):");
			answer = input.next();
		} while (answer.contentEquals("y"));
		System.out.println("程序结束!");
	}
}
