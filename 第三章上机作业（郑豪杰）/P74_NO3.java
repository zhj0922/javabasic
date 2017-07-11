package cn.jbit.shopping3;
import java.util.Scanner;

public class P74_NO3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个整数：");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d ;
		if(a > b){
			d = a;
			a = b;
			b = d;	
		}
		if(a > c){
			d = a;
			a = c;
			c = d;
		}
		if(b > c){
			d = b;
			b = c;
			c = d;
		}
		System.out.println(a+"\t"+b+"\t"+c);
	}
}
