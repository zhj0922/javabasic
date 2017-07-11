package cn.jbit.shopping6;
import java.util.*;

public class P124_No2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;               //循环次数
		int age = 0;               //客户年龄
		int young = 0;            //记录年龄在30岁以下的顾客人数
		for(i = 0; i < 10; i++){
			System.out.print("请输入第"+(i+1)+"位顾客的年龄：");
			 age = input.nextInt();
			 if(age > 30 ){
				 young++;
			 }
		}
		System.out.println("30岁以下的比例是："+(1-young/10.0)*100+"%");
		System.out.println("30岁以上的比例是："+(young/10.0*100)+"%");
	}
}
