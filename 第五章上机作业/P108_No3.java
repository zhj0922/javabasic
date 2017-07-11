package cn.jbit.shopping5;
import java.util.*;

public class P108_No3 {
	public static void main(String[] args) {
		int amount = 0;            //购买数量
		double discount = 0.8;         //折扣比例
		double total = 0.0;          //应付金额
		double payment = 0.0;         // 实付金额
		int goodsNo = 0;              // 商品编号
		String name = "" ;                  //商品名称
		double price = 0.0;                  //商品价格
		double sum = 0.0;                     //合计金额
		System.out.println("请选择要购买的商品编号：");
		System.out.println("1.T恤\t    2.网球鞋\t 3.网球拍");
		System.out.println("* * * * * * * * * * * * * * * * *\t");
		Scanner input = new Scanner(System.in);
		String answer = "y";                //标识是否继续(y/n)
		while(answer.contentEquals("y")) {
			System.out.print("请输入商品编号：");
			 goodsNo = input.nextInt();
			
			 switch(goodsNo){
			 case 1:
				 name = "T恤";
				 price = 245.0;
				          
				break;
			 case 2:
				 name = "网球鞋";
				 price = 570.0;
				 
				 break;
			 case 3:
				 name = "网球拍";
				 price = 320.0;
				 
				 break;
				 default:
					 do{
					 System.out.print("您输入的编号有误，请重新输入：");
					 goodsNo = input.nextInt();
					 }while(goodsNo > 3);
					 switch(goodsNo){
					 case 1:
						 name = "T恤";
						 price = 245.0;
						          
						break;
					 case 2:
						 name = "网球鞋";
						 price = 570.0;
						 
						 break;
					 case 3:
						 name = "网球拍";
						 price = 320.0;
						 
						 break;
					 }
					 break;
					 
			 }
			 System.out.print("请输入购买数量：");
			 amount = input.nextInt();
			 sum = price * amount; 
			 System.out.println(name+"￥"+price+"\t"+"数量"+amount+"\t"+"合计"+"￥"+sum+"\n");
			 System.out.print("是否继续(y/n):");
			 answer = input.next();
		}
		System.out.println("\n折扣："+discount);
		total = sum * discount;      //实付金额=合计*折扣比例
		System.out.println("应付金额："+total);
		System.out.print("实付金额：");
		payment = input.nextDouble();
		if (payment < total){
			System.out.print("你的金额不足!!!，请重新输入：");
			payment = input.nextDouble();
			while(payment < total){
				System.out.print("你的金额不足!!!，请重新输入：");
				payment = input.nextDouble();
			}
			double a = payment - total;           //找钱
			System.out.print("找钱："+a);
		}else{
			double a = payment - total;           //找钱
			System.out.print("找钱："+a);
			
			
		}	
	}
}
