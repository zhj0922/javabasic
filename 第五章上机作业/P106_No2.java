package cn.jbit.shopping5;

import java.util.*;

public class P106_No2 {
	public static void main(String[] args) {
		System.out.println("MyShopping����ϵͳ > �������\n");
		System.out.println("* * * * * * * * * * * * * * * * *\n");
		System.out.println("��ѡ�������Ʒ��ţ�\n 1.T��\t   2.����Ь\t  3.������");
		System.out.println("* * * * * * * * * * * * * * * * * * *\t");
		Scanner input = new Scanner(System.in);

		String answer = ""; // �ж��Ƿ������y/n��
		String name;
		double price;
		int goodsNo;
		do {
			System.out.print("��������Ʒ��ţ�");
			if(input.hasNextInt() == true){
			goodsNo = input.nextInt();
		
			switch (goodsNo) {
			case 1:
				System.out.println("T��\t ��245.0\t");

				break;
			case 2:
				System.out.println("����Ь\t ��570.0\t");

				break;
			case 3:
				System.out.println("������\t ��320.0\t");

				break;
				default:
					while(goodsNo > 3){
					System.out.print("������������������������룺");
					goodsNo = input.nextInt();
					}
					switch (goodsNo) {
					case 1:
						System.out.println("T��\t ��245.0\n");

						break;
					case 2:
						System.out.println("����Ь\t ��570.0\n");

						break;
					case 3:
						System.out.println("������\t ��320.0\n");

						break;
					}
			}
			}else{
		
				System.out.print("��������ȷ�����֣�");
				goodsNo = input.nextInt();
				while(input.hasNextInt() == true){
					System.out.print("��������ȷ�����֣�");
					goodsNo = input.nextInt();
				}
				switch (goodsNo) {
				case 1:
					System.out.println("T��\t ��245.0\n");

					break;
				case 2:
					System.out.println("����Ь\t ��570.0\n");

					break;
				case 3:
					System.out.println("������\t ��320.0\n");

					break;
				}
			}
			System.out.print("�Ƿ����(y/n):");
			answer = input.next();
		} while (answer.contentEquals("y"));
		System.out.println("�������!");
	}
}
