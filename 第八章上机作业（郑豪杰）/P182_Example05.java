package cn.jbit.shopping8;
import java.util.*;

public class P182_Example05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;              //�ܹ����˶��ټ��·�
		for(int i = 1; i <= 5; i++){
			System.out.println("��ӭ���ٵ�"+i+"��ר����");
			for(int j = 1; j <=3; j++){
				System.out.print("Ҫ�뿪��(y/n)?");
				String num = input.next();
				if(num.contentEquals("y")){
					break;
				}
				System.out.println("����1���·�");
				sum++;
			}
			System.out.println("������\n");
		}
		System.out.println("�ܹ�����"+sum+"���·�");
	}
}
