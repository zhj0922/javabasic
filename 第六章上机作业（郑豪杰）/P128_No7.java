package cn.jbit.shopping6;
import java.util.*;
public class P128_No7 {
	public static void main(String[] args) {
		int score;           //�ɼ�
		int sum = 0;         //�ɼ����ڵ���80�ֵ�ѧ������
		Scanner input = new Scanner(System.in);
		System.out.print("����༶��������");
		int count = input.nextInt();
		for(int i = 0; i < count; i++){
			System.out.print("�������"+(i+1)+"λѧ���ĳɼ���");
			 score = input.nextInt();
			if(score >= 80){
				sum++;
			}
		}
		System.out.println("80�����ϵ�ѧ�������ǣ�"+sum);
		double scale = (double)sum / count * 100;
		System.out.print("80�����ϵ�ѧ����ռ�ı���Ϊ��"+scale+"%");
	}
}
