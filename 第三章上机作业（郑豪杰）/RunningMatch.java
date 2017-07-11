package cn.jbit.shopping3;
import java.util.Scanner;

public class RunningMatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入比赛成绩(s)：");
		int matchScore = input.nextInt();
		System.out.print("请输入性别：");
		String gender = input.next();
		if (matchScore <= 10) {
			if (gender.equals("男")) {
				System.out.println("您进入了男子组");
			} else if(gender.equals("女")) {
				System.out.println("您进入了女子组");
			} else {
				System.out.println("您输入的性别有误");
			}
		}else {
			System.out.println("你被淘汰了");
		}
	}
}
