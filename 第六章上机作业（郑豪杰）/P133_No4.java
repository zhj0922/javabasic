package cn.jbit.shopping6;
import java.util.*;

public class P133_No4 {
	public static void main(String[] args) {
		String users = "zhj0922" ;            //�û���
		int password = 123456;            //����
		int i;                  //����
		Scanner input = new Scanner(System.in);
		for(i = 0; i < 3; i++){
			System.out.print("���������û�����");
			users = input.next();
			System.out.print("���������룺");
			password = input.nextInt();
			if(password != 123456 || !users.contentEquals("zhj0922")){
				System.out.println("��������㻹��"+(2-i)+"�λ���!\n");
				continue;
			}
			break;
		}
		if(users.equals("zhj0922") && password ==123456){
			System.out.println("��ӭ��½MyShoppingϵͳ!");
		}else {
			System.out.println("�Բ�����3�ξ��������!\n");
		}
	}
}


