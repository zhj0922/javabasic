package cn.jbit.shopping3;
import java.util.Scanner;

public class GoodLuck1 {
	public static void main(String[] args) {
		System.out.println("�������ع������ϵͳ> ���˳齱\n");
		Scanner input = new Scanner(System.in);
		System.out.print("������4λ��Ա�ţ�");
		int vip = input.nextInt();            //��Ա��
		int random = (int)(Math.random()*10);      //���������
		int baiwei = vip / 100 % 10;                  //�ֽ��ð�λ
		if( baiwei== random){ 
			System.out.println(vip+"�ſͻ������˿ͻ�������mp3һ��");
		}else{
			System.out.println(vip+"�ſͻ���лл���֧��");
		}
	}
}
