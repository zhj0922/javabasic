package cn.jbit.shopping8;
import java.util.*;

public class P182_Example05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;              //总共买了多少件衣服
		for(int i = 1; i <= 5; i++){
			System.out.println("欢迎光临第"+i+"家专卖店");
			for(int j = 1; j <=3; j++){
				System.out.print("要离开吗(y/n)?");
				String num = input.next();
				if(num.contentEquals("y")){
					break;
				}
				System.out.println("买了1件衣服");
				sum++;
			}
			System.out.println("离店结账\n");
		}
		System.out.println("总共买了"+sum+"件衣服");
	}
}
