package cn.jbit.shopping8;

import java.util.Scanner;

public class P184_Example06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		for(int i = 0; i < 3; i++){
			System.out.println("�������"+(i+1)+"����������������Ʒ�ļ۸�");
			for(int j = 0;j < 3; j++){
				double price = input.nextDouble();
				if(price >= 300){
					count++;
				}
			}
			System.out.println("��"+(i+1)+"���˹���"+count+"����Ʒ����8���Ż�!");
			count = 0;
		}
	}
}
