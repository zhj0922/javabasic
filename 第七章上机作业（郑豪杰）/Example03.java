package cn.jbit.shopping7;

import java.util.Arrays;
import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		int[] scores = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("��������λѧԱ�ĳɼ�:");
		for(int i = 0; i < scores.length; i++){
			scores[i] = input.nextInt();
		}
		System.out.print("ѧԱ�ɼ����������У�");
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+" ");
		}
		System.out.print("\nѧԱ�ɼ����������У�");
		for (int i = 0 ; i < scores.length; i++) {
			System.out.print(scores[scores.length - 1 - i]+" " );
		}
	}
}
