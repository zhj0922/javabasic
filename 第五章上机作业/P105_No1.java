package cn.jbit.shopping5;

public class P105_No1 {
	public static void main(String[] args) {
		int num = 0;         //ż��
		int sum = 0;         //ż����
		while(num < 100){
			sum = sum + num;
			num = num + 2;
		}
		System.out.println("100���ڵ�ż��֮���ǣ�"+sum);
	}
}
