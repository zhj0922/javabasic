package cn.jbit.shopping3;
import java.util.Scanner;

public class Pay {
	public static void main(String[] args){
		System.out.println("********���ѵ�********");
		System.out.println("������Ʒ\t   ����\t����\t ���");
		System.out.println("T��\t ��245\t 2\t��490");
		System.out.println("����Ь\t ��570\t 1\t��570");
		System.out.println("������\t ��320\t 1\t��320\n");
		System.out.println("�ۿۣ�\t8��");
		int shirtPrice = 245;
		int shoePrice = 570;
		int padPrice = 320;
		int shirtNo = 2;
		int shoeNo = 1;
		int padNo = 1;
		double discount = 0.8;
		double finalPay = (shirtPrice*shirtNo+shoePrice*shoeNo+padPrice*padNo)*discount;
		int sumPay = 1500;           //ʵ�ʽ��
		double returnMoney = sumPay-finalPay;    //��Ǯ
		int score = (int)finalPay*3/100;      //�������
		System.out.println("�����ܽ���"+finalPay);
		System.out.println("ʵ�� ��  ��"+sumPay);
		System.out.println("��Ǯ��          ��"+returnMoney);
		System.out.println("���ι�������õĻ����ǣ�"+score);
		
		Scanner input = new Scanner(System.in);
		System.out.println("�������ۿۣ�");
		double zheKou = input.nextDouble();        //�Ӽ�����������ۿ�
		double shirtPrice1 = shirtPrice*zheKou;   //T���ۿۺ�۸�
		double shoePrice1 = shoePrice*zheKou;     //����Ь�ۿۺ�۸�
		double padPrice1 = padPrice*zheKou;      //�������ۿۺ�۸�
		boolean num1 = shirtPrice1<100;           //T���ۿۼ۵���100��
		boolean num2 = shoePrice1<100;
		boolean num3 = padPrice1<100;
		System.out.println("T���ۿۼ۵���100��"+num1);
		System.out.println("����Ь�ۿۼ۵���100��"+num2);
		System.out.println("�������ۿۼ۵���100��"+num3);
		
	}
}
