package cn.jbit.shopping6;
import java.util.*;

public class P136_No2 {
	public static void main(String[] args) {
		int sum = 0;
		double avg;
		Scanner input = new Scanner(System.in);
		for(int i = 1; i <= 5; i++){
			System.out.print("��������"+i+"��ѧϰʱ�䣺");
			int time = input.nextInt();
			sum = sum + time;
		}
		avg = (double)sum / 5;
		System.out.println("��һ������ÿ��ƽ��ѧϰʱ���ǣ�"+avg+"Сʱ");
	}
}
