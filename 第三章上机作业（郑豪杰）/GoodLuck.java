
package cn.jbit.shopping3;
import java.util.Scanner;

public class GoodLuck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������λ��Ա���ţ�");
		int custNo = input.nextInt();      //customerָ�ͻ����ͻ���Ա��
		System.out.println("***********************");
		/*
		 * ���ÿλ����
		 */
		int geiWei = custNo%10;  //�ֽ��ø�λ����
		int shiWei = custNo/10%10;
		int baiWei   = custNo/100%10;
		int qianWei = custNo/1000;
		int sum = geiWei+shiWei+baiWei+qianWei;
		System.out.println("��Ա����"+custNo+"��λ֮�ͣ�"+sum);
		boolean xingYun = sum>20;
		System.out.println("�������û���"+xingYun);
	}
}
