package cn.jbit.shopping3;
import java.util.Scanner;

public class GoodLuck2 {
	public static void main(String[] args) {
		/*System.out.println("�������ع������ϵͳ> �ͻ���Ϣ����> ��ӿͻ���Ϣ\n");*/
		Scanner input = new Scanner(System.in);
		/*System.out.print("�������Ա��(<4λ����>)��");
		int custNo = input.nextInt();          //��Ա��
		System.out.print("�������Ա����(��/��<����λ����ʾ>)��");
		String custBirth = input.next();       //��Ա����
		System.out.print("��������֣�");
		int custScore = input.nextInt();       //����
		System.out.println();
		if( custNo>999 && custNo<10000){
			System.out.println("��¼��Ļ�Ա��Ϣ��\n"+custNo+"\t"+custBirth+"\t"+custScore);
		}else{
			System.out.println("��Ϣ¼��ʧ��");                 */
			System.out.print("���������Ĵ���Ԫ����");      //��λ����Ԫ
			int money = input.nextInt();
			if( money >= 500 ){
				System.out.println("������������������");
			}else if( money >= 100 ){
			    System.out.println("�������������� "); 
		    }else if( money >= 50 ){
		    	System.out.println("��������������");
		    }else {
		    	System.out.println("��ʲô�ܳ�������");    
		    }                              
		
	}
}
