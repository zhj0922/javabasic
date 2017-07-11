package cn.jbit.shopping4;

import java.util.*;

public class Compete3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println();
		int num = input.nextInt();
		switch (num) {
		case 1:
		case 3:
		case 5:
			System.out.println("ÆæÊý");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("Å¼Êý");
			break;
		}
	}
}
