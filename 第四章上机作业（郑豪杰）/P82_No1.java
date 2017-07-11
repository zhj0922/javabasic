package cn.jbit.shopping4;
import java.util.*;

public class P82_No1 {
	public static void main(String[] args) {
		System.out.println("\t\t\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t\t\t1.登陆系统\n");
		System.out.println("\t\t\t\t2.退出\n");
		System.out.println("****************************************************************"
				+ "\n");
		Scanner input = new Scanner(System.in);
		System.out.print("请选择，输入数字哦：");
		if(input.hasNextInt() == true) {
			int num = input.nextInt();
			switch(num){
			case 1:
				System.out.println("\t\t\t欢迎使用我行我素购物管理系统\n");
				System.out.println("\t\t\t\t1.客户信息管理\n\t\t\t\t2.购物结算\n\t\t\t\t3.真情回馈\n\t\t\t\t4.注销");
				System.out.println("\n*******************************************************\n");
				System.out.print("请选择，输入数字哦：");
				if(input.hasNextInt() == true) {
					int num1 = input.nextInt();
					switch(num1){
					case 1:
						System.out.println("购物管理系统>客户信息管理");
						System.out.println("1.显示所有客户信息\n2.添加客户信息\n3.修改客户信息\n4.查询客户信息");
						break;
					case 2:
						System.out.println("1.显示所有客户信息\n2.添加客户信息\n3.修改客户信息\n4.查询客户信息");
						break;
					case 3:
						System.out.println("1.显示所有客户信息\n2.添加客户信息\n3.修改客户信息\n4.查询客户信息");
						break;
					case 4:
						System.out.println("\t\t\t欢迎使用我行我素购物管理系统\n");
						System.out.println("\t\t\t\t1.登陆系统\n");
						System.out.println("\t\t\t\t2.退出\n");
					
						System.out.println("请选择，输入数字哦：");
						break;
					default:
						System.out.println("您输入的数字有误，请重新输入！");
						break;
					}
				}else {
					System.out.println("请输入正确的数字");
				}
					
					
				break;
			case 2:
				System.out.println("谢谢您的使用！");
				break;
			default:
					System.out.println("您输入的数字有误，请重新输入！");
					break;
			}
		}else {
			System.out.println("请输入正确的数字");
		}
	}
}
