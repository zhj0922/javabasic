package cn.jbit.shopping3;
import java.util.Scanner;
public class P74_NO2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������䣺");
		int age = input.nextInt();
		System.out.print("�������Ա�");
		String gender = input.next();
		if((age>=7) || (age>=5 && gender.contentEquals("��"))){
			System.out.println("����Գ��԰ᶯ������");
		}else{
			System.out.println("�㲻�ܰᶯ����");
		}
	}
}
