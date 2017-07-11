package cn.jbit.shopping7; 

import java.util.Arrays;

public class P153_Example03 {
	public static void main(String[] args) {
		char[] letter ={'a','c','u','b','e','p','f','z'};
		System.out.println("Ô­×Ö·ûĞòÁĞ£ºa c u b e p f z");
		Arrays.sort(letter);
		System.out.print("ÉıĞòÅÅĞòÎª£º");
		for(int i = 0; i < letter.length; i++){
			System.out.print(letter[i]+" ");
		}
		System.out.print("\nÄæĞòÊä³öÎª£º");
		for (int i = 0; i < letter.length; i++) {
			System.out.print(letter[letter.length - 1 - i]+" ");
		}
	}
}
