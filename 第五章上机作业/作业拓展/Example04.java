package work02;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day;
		System.out.print("请输入年份：");
		int year = input.nextInt();
		System.out.print("请输入月份：");
		int month = input.nextInt();
		day = (year - 1 - 1900) * 365 + (year - 1 - 1900) / 4;
		
	}
}
