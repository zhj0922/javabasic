package cn.jbit.shopping4;

import java.util.Scanner;

public class P88_No2 {
	public static void main(String[] args) {
		System.out.print("���������ѽ�");
		Scanner input = new Scanner(System.in);
		if (input.hasNextInt() == true) {
			int money = input.nextInt();
			System.out.println("�Ƿ�μ��Żݻ������");
			System.out.println("1.��50Ԫ����2Ԫ�������¿���1ƿ");
			System.out.println("2.��100Ԫ����3Ԫ����500ml����һƿ");
			System.out.println("3.��100Ԫ����10Ԫ����5kg���");
			System.out.println("4.��200Ԫ����10Ԫ�ɻ���1���ղ������˹�");
			System.out.println("5.��200Ԫ����20Ԫ�ɻ���ŷ����ˬ��ˮһƿ");
			System.out.println("0��������");

			System.out.print("��ѡ��");
			int num = input.nextInt();
			if (money >= 50 && money < 100) {
				switch (num) {
				case 1:
					double sum = money + 2;
					System.out.println("���������ܽ�" + sum);
					System.out.println("�ɹ�����һƿ���¿��֣�");
					break;
				case 0:
					sum = money;
					System.out.println("���������ܽ�" + money);
					System.out.println("лл���Ĳ���");
					break;
				default:
					System.out.println("���Ľ��ֻ�ܲ��뻻��1");
					break;
				}
			} else if (money >= 100 && money < 200) {
				switch (num) {
				case 1:
					double sum = money + 2;
					System.out.println("���������ܽ�" + sum);
					System.out.println("�ɹ�������1ƿ���¿��֣�");
					break;
				case 2:
					sum = money + 3;
					System.out.println("���������ܽ�" + sum);
					System.out.println("�ɹ�������1ƿ500ml���֣�");
					break;
				case 3:
					sum = money + 10;
					System.out.println("���������ܽ�" + sum);
					System.out.println("�ɹ�������5kg��ۣ�");
					break;
				case 0:
					sum = money;
					System.out.println("���������ܽ�" + money);
					System.out.println("лл���Ĳ���");
					break;
				default:
					System.out.println("���Ľ��ֻ�ܲ��뻻��1����2����3��");
					break;
				}
			}else if (money >= 200) {
				switch (num) {
				case 1:
					double sum = money + 2;
					System.out.println("���������ܽ�" + sum);
					System.out.println("�ɹ�������1ƿ���¿��֣�");
					break;
				case 2:
					sum = money + 3;
					System.out.println("���������ܽ�" + sum);
					System.out.println("�ɹ�������1ƿ500ml���֣�");
					break;
				case 3:
					sum = money + 10;
					System.out.println("���������ܽ�" + sum);
					System.out.println("�ɹ�������5kg��ۣ�");
					break;
				case 4:
					sum = money + 10;
					System.out.println("���������ܽ�" + sum);
					System.out.println("�ɹ�������1���ղ������˹���");
					break;
				case 5:
					sum = money + 20;
					System.out.println("���������ܽ�" + sum);
					System.out.println("�ɹ�������1ƿŷ����ˬ��ˮ��");
					break;
				case 0:
					sum = money;
					System.out.println("���������ܽ�" + money);
					System.out.println("лл���Ĳ���");
					break;
				}
			}else if (money < 50) {
				switch (num) {
				case 0:
					System.out.println("���������ܽ�" + money);
					System.out.println("лл���Ĳ���");
					break;
				default:
					System.out.println("��Ľ�֧�ֲ��뻻����");
					System.out.println("���������ܽ�" + money);
					break;
				}
			}
		} else {
			System.out.println("��������ȷ�����֣�");
		}
	}
}
