package work02;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[]  num = new int[3];
		System.out.print("������һ����������");
		for(int i = 0; i < num.length; i++){
		num[i] = input.nextInt();
		}	
		System.out.println("���ҷ�ת�����");
		for(int i = 0; i < num.length; i++){
			System.out.print(num[num.length - 1 - i]);
		}
	}
}
