package cn.jbit.shopping6;
import java.util.*;

public class P133_No4 {
	public static void main(String[] args) {
		String users = "zhj0922" ;            //用户名
		int password = 123456;            //密码
		int i;                  //次数
		Scanner input = new Scanner(System.in);
		for(i = 0; i < 3; i++){
			System.out.print("请您输入用户名：");
			users = input.next();
			System.out.print("请输入密码：");
			password = input.nextInt();
			if(password != 123456 || !users.contentEquals("zhj0922")){
				System.out.println("输入错误，你还有"+(2-i)+"次机会!\n");
				continue;
			}
			break;
		}
		if(users.equals("zhj0922") && password ==123456){
			System.out.println("欢迎登陆MyShopping系统!");
		}else {
			System.out.println("对不起，您3次均输入错误!\n");
		}
	}
}


