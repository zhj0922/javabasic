package cn.jbit.shopping6;
import java.util.*;

public class P126_No6 {
	public static void main(String[] ar8gs) {
		int sum = 0;           //�ɼ�֮��
		double avg;             //ƽ����
		boolean no1 = false;
		
		Scanner input = new Scanner(System.in);
		System.out.print("����ѧ��������");
		String name = input.next();
		for(int i = 0;i < 5; i++){
			System.out.print("�������"+(i+1)+"�ſεĳɼ���");
			int score = input.nextInt();
			if(score < 0){
			  no1 = true;
			  System.out.println("��Ǹ������¼����������½���¼��!");
				break;
			}
			sum = sum + score;
			
			
		}
		avg = (double)sum / 5;
		System.out.println(name+"ͬѧ��ƽ������"+avg); 
	}
}
