package cn.jbit.shopping5;
import java.util.Scanner;

public class P114_No4 {
	public static void main(String[] args) {
		
	    int min =Integer.MAX_VALUE;           //初始化最小值为int能表示的最大值
	    int max =Integer.MIN_VALUE;           //初始化最大值为int能表示的最小值
	    int num;
	    Scanner input = new Scanner(System.in);
	    do{
	    	System.out.print("请输入一个整数(输入0结束)：");
	    	num = input.nextInt();
	    	if(num > max){
	    		max = num ;
	    	}
	    	if(num < min && num != 0){
	    		min = num;
	    	}
	    }while(num != 0);
	    System.out.println("最大值是："+max+  "最小值是："+min);
	}
}
