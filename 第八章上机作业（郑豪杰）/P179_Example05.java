package cn.jbit.shopping8;

public class P179_Example05 {
	public static void main(String[] args) {
		int line = 9;
		for(int i = 1; i <= line; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.print("\n");
		}
	}
}
