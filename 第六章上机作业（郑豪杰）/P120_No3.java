package cn.jbit.shopping6;
import java.util.Scanner;

public class P120_No3 {
	public static void main(String[] args) {
		int score ;                //成绩
		int sum = 0;               //总分
		double avg = 0;              //平均分
		Scanner input = new Scanner(System.in);
		System.out.print("输入学生姓名：");
		String name = input.next();
		for(int i = 0; i < 5; i++){
			System.out.print("请输入5门功课中第"+(i+1)+"门课的成绩：");
			score = input.nextInt();
			sum = sum + score;
		}
		avg = sum/5;
		System.out.println(name+"的平均分是："+avg);
	}
}
