package cn.jbit.shopping6;

public class P136_No3 {
	public static void main(String[] args) {
		int chook,rabbitNum;
		for(chook = 0; chook <= 35; chook++){
			rabbitNum = 35 - chook;
			if( 2*chook + 4*rabbitNum ==94 ){
				break;
			}
		}
		System.out.println("��������"+chook+"\n"+"�õ�����"+(35-chook));
	}
}
