package cn.jbit.shopping3;
import java.util.Scanner;

public class CalcDiscount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入是否为会员：是(y)/否(其他字符)");
		String vip = input.next();          //控制台输出是否为会员
		System.out.println("请输入购物金额：");
		double money = input.nextDouble();    //控制台输出金额
		if(vip.equals("y")) {
			if(money >= 200) {
				money = money * 0.75;
			}else {
				money = money * 0.80;
			}
		}else if(money > 100){
			money = money * 0.90;
		} else{
			money = money;
		}
		System.out.println("实际支付："+money); 
	}
}
