package cn.jbit.shopping7;

import java.util.Arrays;
import java.util.Scanner;

public class P151_Example03 {
	public static void main(String[] args) {
		int[] scores = new int[5];
	
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++){
			System.out.print("请输入第"+(i+1)+"位学员的成绩：");
			scores[i] = input.nextInt();
		}
		System.out.print("\n将所有学员成绩按升序排列：");
		Arrays.parallelSort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+" ");
		}
		int max = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] > max){
				max = scores[i];
			}
		}
		System.out.println("\n考试成绩的最高分为："+max);
	}
}
