package cn.jbit.shopping3;
import java.util.Scanner;
public class P74_NO2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年龄：");
		int age = input.nextInt();
		System.out.print("请输入性别：");
		String gender = input.next();
		if((age>=7) || (age>=5 && gender.contentEquals("男"))){
			System.out.println("你可以尝试搬动桌子了");
		}else{
			System.out.println("你不能搬动桌子");
		}
	}
}
