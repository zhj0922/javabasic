package cn.jbit.shopping8;

public class P186_Example03 {
	public static void main(String[] args) {
		int i;                //¹«¼¦
		int j;                 // Ä¸¼¦
		int k;                 //³û¼¦
		for(i = 0; i <= 20; i++){
			for(j = 0; j <= 33; j++){
				k = 100 - j - i;
				if(5*i + 3*j + k/3 == 100){
					System.out.println("¹«¼¦£º"+i);
					System.out.println("Ä¸¼¦£º"+j);
					System.out.println("³û¼¦£º"+k);
					break;
					
				}
			}
		}
	}
}
