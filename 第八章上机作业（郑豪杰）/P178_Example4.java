package cn.jbit.shopping8;
import java.util.*;

public class P178_Example4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入等腰三角形的行数：");
		int line = input.nextInt();
		for(int i = 1; i <= line; i++){
			for(int j = 1; j <= line - i; j++){
				System.out.print(" ");
			}
			for(int a = 1; a <= 2 * i - 1; a++){
				System.out.print("*");
			}
		System.out.print("\n");
		}
	}
}
