package cn.jbit.shopping7;

import java.util.Scanner;

public class P154_Example05 {
	public static void main(String[] args) {
		int[] price = new int[4];
		Scanner input = new Scanner(System.in);
		System.out.println("������4�ҵ�ļ۸�");
		for(int i = 0; i < price.length; i++){
			System.out.print("��"+(i+1)+"�ҵ�ļ۸�");
			price[i] = input.nextInt();
			}
		int min = price[0];
		for(int i = 0; i < price.length; i++){
			if(price[i] < min){
				min = price[i];
			}
		}
		System.out.println("��ͼ۸��ǣ�"+min);
	}
}
