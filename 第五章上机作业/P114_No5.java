package cn.jbit.shopping5;
import java.util.*;

public class P114_No5 {
	public static void main(String[] args) {
		int num = 1 ;
		String day ="";
		System.out.print("����������1-7(����0����):");
		Scanner input = new Scanner(System.in);
		if(input.hasNextInt() == true){
			while(num != 0){
			System.out.print("����������1-7(����0����):");
			num = input.nextInt();
			if(num > 0 && num <= 7){
			switch(num){
			case 1:
				day = "MON";
				
				break;
			case 2:
				day = "TUE";
				break;
			case 3:
				day = "WED";
				break;
			case 4:
				day = "THU";
				break;
			case 5:
				day = "FRI";
				break;
			case 6:
				day = "SAT";
				break;
			case 7:
				day = "SUN";
				break;
			}
			System.out.println("������"+day);
			}else if(num > 7){
				System.out.print("���������룺");
				num = input.nextInt();
			}
		}
		}else{
			System.out.print("��������ȷ������");
			num = input.nextInt();
		}
		System.out.println("�������!");
	}
}
