package cn.jbit.shopping8;

import java.util.Scanner;

public class P186_Example02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("ÇëÊäÈëĞĞÊı£º");
		int line = input.nextInt();
		for(int i = 0; i < line; i++){
			for(int a = 0; a < line - 1 - i; a++){
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++){
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}
	}
}
