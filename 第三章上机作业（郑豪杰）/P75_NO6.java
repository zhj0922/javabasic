package cn.jbit.shopping3;
import java.util.*;

public class P75_NO6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����������е��·ݣ�1~12");
		int day = input.nextInt();
		double price = 5000; 
		if(day >= 1 && day <=12){
			System.out.println("������ѡ����Ǿ��òջ���ͷ�Ȳգ�ͷ�Ȳ�����(1)�����ò�����(2��");
			int weizhi = input.nextInt();
			if(day >= 4 && day <= 10){
				if(weizhi == 1){
					price = price*0.9;
					System.out.println("���Ļ�Ʊ�۸�Ϊ��"+price);
				}else if(weizhi == 2){
					price = price*0.8;
					System.out.println("���Ļ�Ʊ�۸�Ϊ��"+price);
				}else{
					System.out.println("�Բ������������������������룡");
				}
			}else{
				if(weizhi == 1){
					price = price*0.5;
					System.out.println("���Ļ�Ʊ�۸�Ϊ��"+price);
				}else if(weizhi == 2){
					price = price*0.4;
					System.out.println("���Ļ�Ʊ�۸�Ϊ��"+price);
				}else{
					System.out.println("�Բ������������������������룡");
				}
			}
		}else {
			System.out.println("�Բ������������������������룡");
		}
	}
}
