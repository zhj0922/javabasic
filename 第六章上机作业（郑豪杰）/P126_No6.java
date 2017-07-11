package cn.jbit.shopping6;
import java.util.*;

public class P126_No6 {
	public static void main(String[] ar8gs) {
		int sum = 0;           //成绩之和
		double avg;             //平均分
		boolean no1 = false;
		
		Scanner input = new Scanner(System.in);
		System.out.print("输入学生姓名：");
		String name = input.next();
		for(int i = 0;i < 5; i++){
			System.out.print("请输入第"+(i+1)+"门课的成绩：");
			int score = input.nextInt();
			if(score < 0){
			  no1 = true;
			  System.out.println("抱歉，分数录入错误，请重新进行录入!");
				break;
			}
			sum = sum + score;
			
			
		}
		avg = (double)sum / 5;
		System.out.println(name+"同学的平均分是"+avg); 
	}
}
