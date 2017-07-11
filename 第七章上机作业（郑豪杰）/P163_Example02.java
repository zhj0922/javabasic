package cn.jbit.shopping7;

import java.util.Arrays;
import java.util.Scanner;

public class P163_Example02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入五句话");
		String[] num = new String[5];
		for(int i = 0; i < num.length; i++){
			System.out.print("第"+(i+1)+"句话：");
			num[i] = input.next();
		}
		System.out.println("\n逆序输出五句话为：");
		for(int i = 0; i < num.length; i++){
			System.out.println(num[num.length - 1 - i]);
		}
	}
}
