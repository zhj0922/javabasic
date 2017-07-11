package cn.jbit.shopping8;

import java.util.Scanner;

public class P187_Example06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入菱形的行数：");
		int line = input.nextInt();
		while((double)line % 2 == 0.0){
			System.out.print("请输入奇数：");
			line = input.nextInt();
		}
		int n = (line + 1) / 2;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n - i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		int m = (line - 1) / 2;
		for(int a = 1; a <= n; a++){
			for(int b = 1; b <= a; b++){
				System.out.print(" ");
			}
			for(int c = 1; c <= (m+1-a)*2-1; c++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
