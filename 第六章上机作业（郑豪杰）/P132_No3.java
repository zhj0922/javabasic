package cn.jbit.shopping6;
import java.util.Scanner;

public class P132_No3 {
	public static void main(String[] args) {
		System.out.println("MyShopping����ϵͳ> �ͻ���Ϣ����> ��ӿͻ���Ϣ\n");
		int vip ;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			System.out.print("�������Ա��(<4λ����>)��");
			 vip = input.nextInt();
			 if(vip < 1000 || vip >= 10000){
				 System.out.println("¼��ʧ��!");
				 continue;
			 }
			 System.out.print("�������Ա����(��/��<����λ������ʾ>)��");
			 String birthday = input.next();
			 System.out.print("�������Ա���֣�");
			 int score = input.nextInt();
			 System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�\n"+vip+ "\t" +birthday+ "\t" +score+ "\n");
		}
		System.out.println("¼��ɹ�!");
	}
}
