package cn.jbit.shopping4;
import java.util.*;

public class P82_No1 {
	public static void main(String[] args) {
		System.out.println("\t\t\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t\t\t1.��½ϵͳ\n");
		System.out.println("\t\t\t\t2.�˳�\n");
		System.out.println("****************************************************************"
				+ "\n");
		Scanner input = new Scanner(System.in);
		System.out.print("��ѡ����������Ŷ��");
		if(input.hasNextInt() == true) {
			int num = input.nextInt();
			switch(num){
			case 1:
				System.out.println("\t\t\t��ӭʹ���������ع������ϵͳ\n");
				System.out.println("\t\t\t\t1.�ͻ���Ϣ����\n\t\t\t\t2.�������\n\t\t\t\t3.�������\n\t\t\t\t4.ע��");
				System.out.println("\n*******************************************************\n");
				System.out.print("��ѡ����������Ŷ��");
				if(input.hasNextInt() == true) {
					int num1 = input.nextInt();
					switch(num1){
					case 1:
						System.out.println("�������ϵͳ>�ͻ���Ϣ����");
						System.out.println("1.��ʾ���пͻ���Ϣ\n2.��ӿͻ���Ϣ\n3.�޸Ŀͻ���Ϣ\n4.��ѯ�ͻ���Ϣ");
						break;
					case 2:
						System.out.println("1.��ʾ���пͻ���Ϣ\n2.��ӿͻ���Ϣ\n3.�޸Ŀͻ���Ϣ\n4.��ѯ�ͻ���Ϣ");
						break;
					case 3:
						System.out.println("1.��ʾ���пͻ���Ϣ\n2.��ӿͻ���Ϣ\n3.�޸Ŀͻ���Ϣ\n4.��ѯ�ͻ���Ϣ");
						break;
					case 4:
						System.out.println("\t\t\t��ӭʹ���������ع������ϵͳ\n");
						System.out.println("\t\t\t\t1.��½ϵͳ\n");
						System.out.println("\t\t\t\t2.�˳�\n");
					
						System.out.println("��ѡ����������Ŷ��");
						break;
					default:
						System.out.println("������������������������룡");
						break;
					}
				}else {
					System.out.println("��������ȷ������");
				}
					
					
				break;
			case 2:
				System.out.println("лл����ʹ�ã�");
				break;
			default:
					System.out.println("������������������������룡");
					break;
			}
		}else {
			System.out.println("��������ȷ������");
		}
	}
}
