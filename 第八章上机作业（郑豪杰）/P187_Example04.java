package cn.jbit.shopping8;

import java.util.Scanner;

public class P187_Example04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] scores = new int[3][4];
		int sum = 0;
		int num = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.print("�������" + (i + 1) + "��ĳɼ�:");
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = input.nextInt();
				if(scores[i][j] > 85){
					sum = sum + scores[i][j];
					num++;
				}
			}		
		}
		double avg = (double)sum / num;
		System.out.println("�����༶���в���ѧԱ�ɼ�����85�ֵ�ѧԱ��ƽ�����ǣ�"+avg);
	}
}