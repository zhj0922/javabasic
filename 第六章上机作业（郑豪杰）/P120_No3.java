package cn.jbit.shopping6;
import java.util.Scanner;

public class P120_No3 {
	public static void main(String[] args) {
		int score ;                //�ɼ�
		int sum = 0;               //�ܷ�
		double avg = 0;              //ƽ����
		Scanner input = new Scanner(System.in);
		System.out.print("����ѧ��������");
		String name = input.next();
		for(int i = 0; i < 5; i++){
			System.out.print("������5�Ź����е�"+(i+1)+"�ſεĳɼ���");
			score = input.nextInt();
			sum = sum + score;
		}
		avg = sum/5;
		System.out.println(name+"��ƽ�����ǣ�"+avg);
	}
}
