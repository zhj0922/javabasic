package cn.jbit.shopping3;

import java.util.*;

public class P75_No5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("刘珊珊同学的Java成绩：");
		if (input.hasNextInt()) {
			int score = input.nextInt();
			int num = score / 10;
			switch (num) {
			case 10:
				System.out.println("父亲给她买辆车");
				break;
			case 9:
				System.out.println("母亲给她买一部笔记本电脑");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("母亲给她买手机");
				break;
			default:
				System.out.println("没有礼物");
				break;
			}
		} else {
			System.out.println("请输入正确的数字");
		}
	}
}
