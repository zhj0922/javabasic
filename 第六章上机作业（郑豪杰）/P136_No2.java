package cn.jbit.shopping6;
import java.util.*;

public class P136_No2 {
	public static void main(String[] args) {
		int sum = 0;
		double avg;
		Scanner input = new Scanner(System.in);
		for(int i = 1; i <= 5; i++){
			System.out.print("请输入周"+i+"的学习时间：");
			int time = input.nextInt();
			sum = sum + time;
		}
		avg = (double)sum / 5;
		System.out.println("周一至周五每日平均学习时间是："+avg+"小时");
	}
}
