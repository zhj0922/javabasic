package cn.jbit.shopping6;
import java.util.*;

public class P124_No2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;               //ѭ������
		int age = 0;               //�ͻ�����
		int young = 0;            //��¼������30�����µĹ˿�����
		for(i = 0; i < 10; i++){
			System.out.print("�������"+(i+1)+"λ�˿͵����䣺");
			 age = input.nextInt();
			 if(age > 30 ){
				 young++;
			 }
		}
		System.out.println("30�����µı����ǣ�"+(1-young/10.0)*100+"%");
		System.out.println("30�����ϵı����ǣ�"+(young/10.0*100)+"%");
	}
}
