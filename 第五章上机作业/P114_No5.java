package cn.jbit.shopping5;
import java.util.*;

public class P114_No5 {
	public static void main(String[] args) {
		int num = 1 ;
		String day ="";
		System.out.print("请输入整数1-7(输入0结束):");
		Scanner input = new Scanner(System.in);
		if(input.hasNextInt() == true){
			while(num != 0){
			System.out.print("请输入整数1-7(输入0结束):");
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
			System.out.println("今天是"+day);
			}else if(num > 7){
				System.out.print("请重新输入：");
				num = input.nextInt();
			}
		}
		}else{
			System.out.print("请输入正确的数字");
			num = input.nextInt();
		}
		System.out.println("程序结束!");
	}
}
