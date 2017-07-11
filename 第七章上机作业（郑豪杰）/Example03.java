package cn.jbit.shopping7;

import java.util.Arrays;
import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		int[] scores = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("请输入五位学员的成绩:");
		for(int i = 0; i < scores.length; i++){
			scores[i] = input.nextInt();
		}
		System.out.print("学员成绩按升序排列：");
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+" ");
		}
		System.out.print("\n学员成绩按降序排列：");
		for (int i = 0 ; i < scores.length; i++) {
			System.out.print(scores[scores.length - 1 - i]+" " );
		}
	}
}
