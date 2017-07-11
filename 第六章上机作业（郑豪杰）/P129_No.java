package cn.jbit.shopping6;

public class P129_No {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		for(int i = 0;i < 100; i++){
			num++;
			int no1 = num % 10;
			int no2 = num % 3;
			if((no1 == 2 || no1 == 3 || no1 == 4 || no1 == 7) && no2 == 0){
				continue;
			}
			sum = sum + num;
			
		}
		System.out.println("整数之和为："+sum);
	}
}
