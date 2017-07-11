package cn.jbit.shopping3;
import java.util.*;
public class P74_NO4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = input.nextInt();
		int day1 = num % 3;
		int day2 = num % 5;
		if(num > 0){
			if(day1 == 0 || day2 == 0){
				System.out.println("该整数是3或5的倍数");
			}else{
				System.out.println("该数不能被3或5中的任何一个数整除");
			}
		}else{
			System.out.println("该数不能被3或5中的任何一个数整除");
		}
	}
}
