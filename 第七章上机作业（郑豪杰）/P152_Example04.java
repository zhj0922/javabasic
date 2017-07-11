package cn.jbit.shopping7;

import java.util.Scanner;

public class P152_Example04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] scores = new int[6];
		scores[0] = 99;
		scores[1] = 85;
		scores[2] = 82;
		scores[3] = 63;
		scores[4] = 60;
		int num = scores.length;
		System.out.println("请选择新增成绩：");
		int score = input.nextInt();
		for(int i = 0; i < scores.length; i++){
			if(score > scores[i]){
				num = i;
				break;
			}
		}
		System.out.println("插入成绩的下标是："+num);
		System.out.println("插入后的成绩信息是：");
		for(int j = scores.length - 1; j > num; j--){
			scores[j] = scores[j - 1];
		}
		scores[num] = score;
		for(int k = 0; k < scores.length; k++){
			System.out.print(scores[k]+" ");
		}
	}
}
