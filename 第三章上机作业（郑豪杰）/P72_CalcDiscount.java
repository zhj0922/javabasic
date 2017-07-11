package cn.jbit.shopping3;
import java.util.Scanner;

public class P72_CalcDiscount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入会员积分：");
		double x = input.nextDouble();
		double y;
		if(x < 2000) {
			 y = 0.9;
			 x = x * y;
		}else if(x >= 2000 && x < 4000) {
			y = 0.8;
			x = x * y;
		}else if(x >= 4000 && x < 8000) {
			 y = 0.7;
			x = x * y;
		}else {
			 y = 0.6; 
			x = x * y;
		}
		System.out.println("该会员享受的折扣是："+y);
		System.out.println(x );
	}
}
