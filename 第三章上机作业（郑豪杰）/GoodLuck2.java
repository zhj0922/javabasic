package cn.jbit.shopping3;
import java.util.Scanner;

public class GoodLuck2 {
	public static void main(String[] args) {
		/*System.out.println("我行我素购物管理系统> 客户信息管理> 添加客户信息\n");*/
		Scanner input = new Scanner(System.in);
		/*System.out.print("请输入会员号(<4位整数>)：");
		int custNo = input.nextInt();          //会员号
		System.out.print("请输入会员生日(月/日<用两位数表示>)：");
		String custBirth = input.next();       //会员生日
		System.out.print("请输入积分：");
		int custScore = input.nextInt();       //积分
		System.out.println();
		if( custNo>999 && custNo<10000){
			System.out.println("已录入的会员信息：\n"+custNo+"\t"+custBirth+"\t"+custScore);
		}else{
			System.out.println("信息录入失败");                 */
			System.out.print("请输入您的存款（万元）：");      //单位：万元
			int money = input.nextInt();
			if( money >= 500 ){
				System.out.println("您可以买辆凯迪拉克");
			}else if( money >= 100 ){
			    System.out.println("您可以买辆奔驰 "); 
		    }else if( money >= 50 ){
		    	System.out.println("您可以买辆宝马");
		    }else {
		    	System.out.println("您什么跑车都买不了");    
		    }                              
		
	}
}
