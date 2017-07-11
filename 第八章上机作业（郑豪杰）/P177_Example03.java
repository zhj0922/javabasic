package cn.jbit.shopping8;
import java.util.*;

public class P177_Example03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入倒直角三角形的行数：");
		int line = input.nextInt();
		for(int i = 1; i <= line; i++){
			for(int j = 1; j <= line + 1 - i; j++){
				System.out.print("*");
			}
			System.out.println(
					);
		}
	}
}
