package cn.jbit.shopping5;
import java.util.Scanner;

public class P98_No5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("合格了吗？(y/n)：");
		String answer = input.next();
		while(answer.contentEquals("n")){
			System.out.println("上午阅读教程!\n下午上机编程!\n");
			System.out.print("合格了吗？(y/n)：");
			answer = input.next();
		}
		System.out.println("完成学习任务!");
	}
}
