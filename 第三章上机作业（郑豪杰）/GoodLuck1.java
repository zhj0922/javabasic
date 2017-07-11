package cn.jbit.shopping3;
import java.util.Scanner;

public class GoodLuck1 {
	public static void main(String[] args) {
		System.out.println("我行我素购物管理系统> 幸运抽奖\n");
		Scanner input = new Scanner(System.in);
		System.out.print("请输入4位会员号：");
		int vip = input.nextInt();            //会员号
		int random = (int)(Math.random()*10);      //产生随机数
		int baiwei = vip / 100 % 10;                  //分解获得百位
		if( baiwei== random){ 
			System.out.println(vip+"号客户是幸运客户，获精美mp3一个");
		}else{
			System.out.println(vip+"号客户，谢谢你的支持");
		}
	}
}
