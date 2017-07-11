package cn.jbit.shopping8;
import java.util.*;

public class P176_Example02 {
	public static void main(String[] args) {
		System.out.println("´òÓ¡Èý½ÇÐÎ:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= i*2-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
