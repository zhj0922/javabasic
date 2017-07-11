package cn.jbit.shopping4;

import java.util.Scanner;

public class P88_No2 {
	public static void main(String[] args) {
		System.out.print("请输入消费金额：");
		Scanner input = new Scanner(System.in);
		if (input.hasNextInt() == true) {
			int money = input.nextInt();
			System.out.println("是否参加优惠换购活动：");
			System.out.println("1.满50元，加2元换购百事可乐1瓶");
			System.out.println("2.满100元，加3元换购500ml可乐一瓶");
			System.out.println("3.满100元，加10元换购5kg面粉");
			System.out.println("4.满200元，加10元可换购1个苏泊尔炒菜锅");
			System.out.println("5.满200元，加20元可换购欧莱雅爽肤水一瓶");
			System.out.println("0：不换购");

			System.out.print("请选择：");
			int num = input.nextInt();
			if (money >= 50 && money < 100) {
				switch (num) {
				case 1:
					double sum = money + 2;
					System.out.println("本次消费总金额：" + sum);
					System.out.println("成功换购一瓶百事可乐！");
					break;
				case 0:
					sum = money;
					System.out.println("本次消费总金额：" + money);
					System.out.println("谢谢您的参与");
					break;
				default:
					System.out.println("您的金额只能参与换购1");
					break;
				}
			} else if (money >= 100 && money < 200) {
				switch (num) {
				case 1:
					double sum = money + 2;
					System.out.println("本次消费总金额：" + sum);
					System.out.println("成功换购：1瓶百事可乐！");
					break;
				case 2:
					sum = money + 3;
					System.out.println("本次消费总金额：" + sum);
					System.out.println("成功换购：1瓶500ml可乐！");
					break;
				case 3:
					sum = money + 10;
					System.out.println("本次消费总金额：" + sum);
					System.out.println("成功换购：5kg面粉！");
					break;
				case 0:
					sum = money;
					System.out.println("本次消费总金额：" + money);
					System.out.println("谢谢您的参与");
					break;
				default:
					System.out.println("您的金额只能参与换购1或者2或者3！");
					break;
				}
			}else if (money >= 200) {
				switch (num) {
				case 1:
					double sum = money + 2;
					System.out.println("本次消费总金额：" + sum);
					System.out.println("成功换购：1瓶百事可乐！");
					break;
				case 2:
					sum = money + 3;
					System.out.println("本次消费总金额：" + sum);
					System.out.println("成功换购：1瓶500ml可乐！");
					break;
				case 3:
					sum = money + 10;
					System.out.println("本次消费总金额：" + sum);
					System.out.println("成功换购：5kg面粉！");
					break;
				case 4:
					sum = money + 10;
					System.out.println("本次消费总金额：" + sum);
					System.out.println("成功换购：1个苏泊尔炒菜锅！");
					break;
				case 5:
					sum = money + 20;
					System.out.println("本次消费总金额：" + sum);
					System.out.println("成功换购：1瓶欧莱雅爽肤水！");
					break;
				case 0:
					sum = money;
					System.out.println("本次消费总金额：" + money);
					System.out.println("谢谢您的参与");
					break;
				}
			}else if (money < 50) {
				switch (num) {
				case 0:
					System.out.println("本次消费总金额：" + money);
					System.out.println("谢谢您的参与");
					break;
				default:
					System.out.println("你的金额不支持参与换购！");
					System.out.println("本次消费总金额：" + money);
					break;
				}
			}
		} else {
			System.out.println("请输入正确的数字！");
		}
	}
}
