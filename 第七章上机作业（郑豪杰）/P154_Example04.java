package cn.jbit.shopping7;


import java.util.Scanner;

public class P154_Example04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] letter = new String[9];
		letter[0] = "a";
		letter[1] = "b";
		letter[2] = "c";
		letter[3] = "e";
		letter[4] = "f";
		letter[5] = "p";
		letter[6] = "u";
		letter[7] = "z";
		int num = letter.length;
		System.out.print("原字符序列：");
		for(int i = 0; i < letter.length - 1; i++){
			System.out.print(letter[i]+" ");
		}
		System.out.print("\n待插入的字符是：");
		String liter = input.next();
		for(int j = 0; j < letter.length; j++){
			if( letter[j].compareToIgnoreCase (liter) > 0 ){
				num = j;
				break;
			}
		}
		System.out.println("插入成绩的下标是"+num);
		System.out.print("插入后的字符序列是：");
		for(int k = letter.length - 1; k > num; k--){
			letter[k] = letter[k - 1];
		}
		letter[num] = liter;
		for(int l = 0; l < letter.length; l++){
			System.out.print(letter[l]+" ");
		}
	}
}
