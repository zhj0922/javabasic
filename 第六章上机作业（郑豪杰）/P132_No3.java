package cn.jbit.shopping6;
import java.util.Scanner;

public class P132_No3 {
	public static void main(String[] args) {
		System.out.println("MyShopping管理系统> 客户信息管理> 添加客户信息\n");
		int vip ;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			System.out.print("请输入会员号(<4位整数>)：");
			 vip = input.nextInt();
			 if(vip < 1000 || vip >= 10000){
				 System.out.println("录入失败!");
				 continue;
			 }
			 System.out.print("请输入会员生日(月/日<用两位整数表示>)：");
			 String birthday = input.next();
			 System.out.print("请输入会员积分：");
			 int score = input.nextInt();
			 System.out.println("您录入的会员信息是：\n"+vip+ "\t" +birthday+ "\t" +score+ "\n");
		}
		System.out.println("录入成功!");
	}
}
