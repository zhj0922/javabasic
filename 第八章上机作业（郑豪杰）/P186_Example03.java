package cn.jbit.shopping8;

public class P186_Example03 {
	public static void main(String[] args) {
		int i;                //����
		int j;                 // ĸ��
		int k;                 //����
		for(i = 0; i <= 20; i++){
			for(j = 0; j <= 33; j++){
				k = 100 - j - i;
				if(5*i + 3*j + k/3 == 100){
					System.out.println("������"+i);
					System.out.println("ĸ����"+j);
					System.out.println("������"+k);
					break;
					
				}
			}
		}
	}
}
