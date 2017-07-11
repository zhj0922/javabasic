package cn.jbit.shopping6;
import java.util.Scanner;

public class P121_No {
	public static void main(String[] args) {
		int i,j;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个值：");
		int num = input.nextInt();
		System.out.println("根据这个值可以输入以下乘法表：");
		for(i = 0,j = num; i <= num; i++,j--){
			System.out.println(i+  "*" + j+  "=" +  (i*j));
		}
	}
}
