package cn.jbit.shopping5;

public class P105_No1 {
	public static void main(String[] args) {
		int num = 0;         //偶数
		int sum = 0;         //偶数和
		while(num < 100){
			sum = sum + num;
			num = num + 2;
		}
		System.out.println("100以内的偶数之和是："+sum);
	}
}
