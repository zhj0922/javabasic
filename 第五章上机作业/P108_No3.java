package cn.jbit.shopping5;
import java.util.*;

public class P108_No3 {
	public static void main(String[] args) {
		int amount = 0;            //��������
		double discount = 0.8;         //�ۿ۱���
		double total = 0.0;          //Ӧ�����
		double payment = 0.0;         // ʵ�����
		int goodsNo = 0;              // ��Ʒ���
		String name = "" ;                  //��Ʒ����
		double price = 0.0;                  //��Ʒ�۸�
		double sum = 0.0;                     //�ϼƽ��
		System.out.println("��ѡ��Ҫ�������Ʒ��ţ�");
		System.out.println("1.T��\t    2.����Ь\t 3.������");
		System.out.println("* * * * * * * * * * * * * * * * *\t");
		Scanner input = new Scanner(System.in);
		String answer = "y";                //��ʶ�Ƿ����(y/n)
		while(answer.contentEquals("y")) {
			System.out.print("��������Ʒ��ţ�");
			 goodsNo = input.nextInt();
			
			 switch(goodsNo){
			 case 1:
				 name = "T��";
				 price = 245.0;
				          
				break;
			 case 2:
				 name = "����Ь";
				 price = 570.0;
				 
				 break;
			 case 3:
				 name = "������";
				 price = 320.0;
				 
				 break;
				 default:
					 do{
					 System.out.print("������ı���������������룺");
					 goodsNo = input.nextInt();
					 }while(goodsNo > 3);
					 switch(goodsNo){
					 case 1:
						 name = "T��";
						 price = 245.0;
						          
						break;
					 case 2:
						 name = "����Ь";
						 price = 570.0;
						 
						 break;
					 case 3:
						 name = "������";
						 price = 320.0;
						 
						 break;
					 }
					 break;
					 
			 }
			 System.out.print("�����빺��������");
			 amount = input.nextInt();
			 sum = price * amount; 
			 System.out.println(name+"��"+price+"\t"+"����"+amount+"\t"+"�ϼ�"+"��"+sum+"\n");
			 System.out.print("�Ƿ����(y/n):");
			 answer = input.next();
		}
		System.out.println("\n�ۿۣ�"+discount);
		total = sum * discount;      //ʵ�����=�ϼ�*�ۿ۱���
		System.out.println("Ӧ����"+total);
		System.out.print("ʵ����");
		payment = input.nextDouble();
		if (payment < total){
			System.out.print("��Ľ���!!!�����������룺");
			payment = input.nextDouble();
			while(payment < total){
				System.out.print("��Ľ���!!!�����������룺");
				payment = input.nextDouble();
			}
			double a = payment - total;           //��Ǯ
			System.out.print("��Ǯ��"+a);
		}else{
			double a = payment - total;           //��Ǯ
			System.out.print("��Ǯ��"+a);
			
			
		}	
	}
}
