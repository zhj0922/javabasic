package cn.jbit.shopping3;
import java.util.Scanner;
public class Demo_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dole;
		System.out.println("输出互换前手中的纸牌：");
		System.out.print("左手中的纸牌：");
		int zuo = input.nextInt();
		System.out.print("右手中的纸牌：");
		int you = input.nextInt();
		System.out.println("************");
		
		dole = zuo;
		zuo = you;
		you = dole;
		System.out.println("输出互换后手中的纸牌：");
		System.out.println("左手中的纸牌："+zuo);
		System.out.println("右手中的纸牌："+you);
		
	}
}
