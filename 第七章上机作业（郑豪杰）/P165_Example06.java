package cn.jbit.shopping7;

import java.util.Scanner;

public class P165_Example06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] music = new String[5];
		music[0] = "Island";
		music[1] = "Ocean";
		music[2] = "Pretty";
		music[3] = "Sun";
		int num = music.length;
		System.out.print("插入前的数组为：");
		for(int i = 0; i < music.length - 1; i++){
			System.out.print(music[i]+" ");
		}
		System.out.print("\n请输入歌曲名称：");
		String music1 = input.next();
		for(int j = 0; j < music.length; j++){
			if(music[j].compareToIgnoreCase(music1) > 0){
				num = j;
				break;
			}
		}
		System.out.print("插入后的数组为：");
		for(int k = music.length - 1; k > num; k--){
			music[k] = music[k - 1];
		}
		music[num] = music1;
		for(int l = 0; l < music.length; l++){
			System.out.print(music[l]+" ");
		}
	}
}
