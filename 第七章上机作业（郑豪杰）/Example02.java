package cn.jbit.shopping7;

import java.util.*;

public class Example02 {
	public static void main(String[] args) {
		/*int[] scores = new int[5];
		int sum = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++){
			System.out.print("�������"+(i+1)+"λͬѧ�ĳɼ�:");
			scores[i] = input.nextInt();
			sum = sum + scores[i];
		}
		double avg = (double)sum / scores.length;
		System.out.println("ȫ��ͬѧ��ƽ�����ǣ�"+avg);
		*/
		int sum = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
			System.out.print("�������"+(i+1)+"λͬѧ�ĳɼ�:");
			int scores = input.nextInt();
			sum = sum + scores;
		}
		double avg = (double)sum / 5;
		System.out.println("ȫ��ͬѧ��ƽ�����ǣ�"+avg);
	}
}
