package cn.jbit.shopping3;
import java.util.Scanner;

public class CalcDiscount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ƿ�Ϊ��Ա����(y)/��(�����ַ�)");
		String vip = input.next();          //����̨����Ƿ�Ϊ��Ա
		System.out.println("�����빺���");
		double money = input.nextDouble();    //����̨������
		if(vip.equals("y")) {
			if(money >= 200) {
				money = money * 0.75;
			}else {
				money = money * 0.80;
			}
		}else if(money > 100){
			money = money * 0.90;
		} else{
			money = money;
		}
		System.out.println("ʵ��֧����"+money); 
	}
}
