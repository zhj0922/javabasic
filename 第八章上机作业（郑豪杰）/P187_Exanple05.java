package cn.jbit.shopping8;

import java.util.Scanner;

public class P187_Exanple05 {
	public static void main(String[] args) {
		int password;
		int money;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			System.out.print("���������룺");
			password = input.nextInt();
			if(password == 111111){
				System.out.print("�������");
				money = input.nextInt();
				for (int j = 0; j < 3; j++){
					if(money >= 0 && money <= 1000 && money % 100 == 0){
						System.out.println("��ȡ��"+money+"Ԫ");
						System.out.println("������ɣ���ȡ��!");
						i = 4;
						break;
					}
					System.out.print("��������Ľ��Ϸ����㻹��"+(2 - j)+"�λ��᣺");
					money = input.nextInt();
					continue;
				} 
			}
			if(i == 2){
				System.out.println("���������ȡ��!");
			}
		}
	}
}
