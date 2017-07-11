package cn.jbit.shopping3;
import java.util.Scanner;

public class P74_NO1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名：");
		char name = input.next().charAt(0);
		System.out.print("请输入密码：");
		int score = input.nextInt();
		if ((name == '青') && (score == 123) ) {
			System.out.println("欢迎你，青");
		}else {
			System.out.println("对不起，你不是青");
		}
	}
}
 