package cn.jbit.shopping3;
import java.util.*;

public class P75_NO6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您出行的月份：1~12");
		int day = input.nextInt();
		double price = 5000; 
		if(day >= 1 && day <=12){
			System.out.println("请问您选择的是经济舱还是头等舱？头等舱输入(1)，经济舱输入(2：");
			int weizhi = input.nextInt();
			if(day >= 4 && day <= 10){
				if(weizhi == 1){
					price = price*0.9;
					System.out.println("您的机票价格为："+price);
				}else if(weizhi == 2){
					price = price*0.8;
					System.out.println("您的机票价格为："+price);
				}else{
					System.out.println("对不起，您的输入有误，请重新输入！");
				}
			}else{
				if(weizhi == 1){
					price = price*0.5;
					System.out.println("您的机票价格为："+price);
				}else if(weizhi == 2){
					price = price*0.4;
					System.out.println("您的机票价格为："+price);
				}else{
					System.out.println("对不起，您的输入有误，请重新输入！");
				}
			}
		}else {
			System.out.println("对不起，您的输入有误，请重新输入！");
		}
	}
}
