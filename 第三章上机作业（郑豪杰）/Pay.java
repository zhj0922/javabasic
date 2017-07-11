package cn.jbit.shopping3;
import java.util.Scanner;

public class Pay {
	public static void main(String[] args){
		System.out.println("********消费单********");
		System.out.println("购买物品\t   单价\t个数\t 金额");
		System.out.println("T恤\t ￥245\t 2\t￥490");
		System.out.println("网球鞋\t ￥570\t 1\t￥570");
		System.out.println("网球拍\t ￥320\t 1\t￥320\n");
		System.out.println("折扣：\t8折");
		int shirtPrice = 245;
		int shoePrice = 570;
		int padPrice = 320;
		int shirtNo = 2;
		int shoeNo = 1;
		int padNo = 1;
		double discount = 0.8;
		double finalPay = (shirtPrice*shirtNo+shoePrice*shoeNo+padPrice*padNo)*discount;
		int sumPay = 1500;           //实际金额
		double returnMoney = sumPay-finalPay;    //找钱
		int score = (int)finalPay*3/100;      //所获积分
		System.out.println("消费总金额：￥"+finalPay);
		System.out.println("实际 金额：  ￥"+sumPay);
		System.out.println("找钱：          ￥"+returnMoney);
		System.out.println("本次购物所获得的积分是："+score);
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入折扣：");
		double zheKou = input.nextDouble();        //从键盘中输入的折扣
		double shirtPrice1 = shirtPrice*zheKou;   //T恤折扣后价格
		double shoePrice1 = shoePrice*zheKou;     //网球鞋折扣后价格
		double padPrice1 = padPrice*zheKou;      //网球拍折扣后价格
		boolean num1 = shirtPrice1<100;           //T恤折扣价低于100吗
		boolean num2 = shoePrice1<100;
		boolean num3 = padPrice1<100;
		System.out.println("T恤折扣价低于100吗："+num1);
		System.out.println("网球鞋折扣价低于100吗："+num2);
		System.out.println("网球拍折扣价低于100吗："+num3);
		
	}
}
