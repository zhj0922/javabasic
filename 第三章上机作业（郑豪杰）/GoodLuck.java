
package cn.jbit.shopping3;
import java.util.Scanner;

public class GoodLuck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入四位会员卡号：");
		int custNo = input.nextInt();      //customer指客户，客户会员号
		System.out.println("***********************");
		/*
		 * 获得每位数字
		 */
		int geiWei = custNo%10;  //分解获得个位数字
		int shiWei = custNo/10%10;
		int baiWei   = custNo/100%10;
		int qianWei = custNo/1000;
		int sum = geiWei+shiWei+baiWei+qianWei;
		System.out.println("会员卡号"+custNo+"各位之和："+sum);
		boolean xingYun = sum>20;
		System.out.println("是幸运用户吗："+xingYun);
	}
}
