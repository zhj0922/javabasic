package cn.jbit.shopping7;

import java.util.*;

public class Example02 {
	public static void main(String[] args) {
		/*int[] scores = new int[5];
		int sum = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++){
			System.out.print("请输入第"+(i+1)+"位同学的成绩:");
			scores[i] = input.nextInt();
			sum = sum + scores[i];
		}
		double avg = (double)sum / scores.length;
		System.out.println("全班同学的平均分是："+avg);
		*/
		int sum = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
			System.out.print("请输入第"+(i+1)+"位同学的成绩:");
			int scores = input.nextInt();
			sum = sum + scores;
		}
		double avg = (double)sum / 5;
		System.out.println("全班同学的平均分是："+avg);
	}
}
