package cn.jbit.shopping6;
import java.util.*;
public class P128_No7 {
	public static void main(String[] args) {
		int score;           //成绩
		int sum = 0;         //成绩大于等于80分的学生人数
		Scanner input = new Scanner(System.in);
		System.out.print("输入班级总人数：");
		int count = input.nextInt();
		for(int i = 0; i < count; i++){
			System.out.print("请输入第"+(i+1)+"位学生的成绩：");
			 score = input.nextInt();
			if(score >= 80){
				sum++;
			}
		}
		System.out.println("80分以上的学生人数是："+sum);
		double scale = (double)sum / count * 100;
		System.out.print("80分以上的学生所占的比例为："+scale+"%");
	}
}
