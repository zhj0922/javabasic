package cn.jbit.shopping6;

public class P123_No1 {
	public static void main(String[] args) {
		int num,sum;
		for(num = 1,sum = 0; num < 100; num = num + 2){
			sum = sum + num;
		}
		System.out.println("100���ڵ�����֮��Ϊ��"+sum);
		int num1 = 1;
		int sum2 = 0;
		while(num1 <= 100){
			sum2 = num1 + sum2;
			num1 = num1 + 2;
		}
		System.out.println("100���ڵ�����֮��Ϊ��"+sum2);
		int num2 = 1;
		int sum3 = 0;
		do{
			
			sum3 = num2 + sum3;
			num2 = num2 + 2;
		}while(num2 < 100);
		System.out.println("100���ڵ�����֮��Ϊ��"+sum3);
	}
	
}
