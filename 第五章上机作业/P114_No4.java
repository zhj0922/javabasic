package cn.jbit.shopping5;
import java.util.Scanner;

public class P114_No4 {
	public static void main(String[] args) {
		
	    int min =Integer.MAX_VALUE;           //��ʼ����СֵΪint�ܱ�ʾ�����ֵ
	    int max =Integer.MIN_VALUE;           //��ʼ�����ֵΪint�ܱ�ʾ����Сֵ
	    int num;
	    Scanner input = new Scanner(System.in);
	    do{
	    	System.out.print("������һ������(����0����)��");
	    	num = input.nextInt();
	    	if(num > max){
	    		max = num ;
	    	}
	    	if(num < min && num != 0){
	    		min = num;
	    	}
	    }while(num != 0);
	    System.out.println("���ֵ�ǣ�"+max+  "��Сֵ�ǣ�"+min);
	}
}
