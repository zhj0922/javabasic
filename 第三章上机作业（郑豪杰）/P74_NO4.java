package cn.jbit.shopping3;
import java.util.*;
public class P74_NO4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��������");
		int num = input.nextInt();
		int day1 = num % 3;
		int day2 = num % 5;
		if(num > 0){
			if(day1 == 0 || day2 == 0){
				System.out.println("��������3��5�ı���");
			}else{
				System.out.println("�������ܱ�3��5�е��κ�һ��������");
			}
		}else{
			System.out.println("�������ܱ�3��5�е��κ�һ��������");
		}
	}
}
