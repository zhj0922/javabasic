package cn.jbit.shopping7; 

import java.util.Arrays;

public class P153_Example03 {
	public static void main(String[] args) {
		char[] letter ={'a','c','u','b','e','p','f','z'};
		System.out.println("ԭ�ַ����У�a c u b e p f z");
		Arrays.sort(letter);
		System.out.print("��������Ϊ��");
		for(int i = 0; i < letter.length; i++){
			System.out.print(letter[i]+" ");
		}
		System.out.print("\n�������Ϊ��");
		for (int i = 0; i < letter.length; i++) {
			System.out.print(letter[letter.length - 1 - i]+" ");
		}
	}
}
