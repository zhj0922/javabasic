package cn.jbit.shopping7;

import java.util.Arrays;
import java.util.Scanner;

public class P151_Example03 {
	public static void main(String[] args) {
		int[] scores = new int[5];
	
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++){
			System.out.print("�������"+(i+1)+"λѧԱ�ĳɼ���");
			scores[i] = input.nextInt();
		}
		System.out.print("\n������ѧԱ�ɼ����������У�");
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
		System.out.println("\n���Գɼ�����߷�Ϊ��"+max);
	}
}
