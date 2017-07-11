package cn.jbit.shopping7;

public class Example01 {
	public static void main(String[] args) {
		int[] score = {95,85,79,88,64};
		int sum = 0;
		for(int i = 0; i < score.length; i++){
			sum = sum + score[i];
		}
		double avg = (double)sum / score.length;
		System.out.println("平均分是："+avg);
	}
}
