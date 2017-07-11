package cn.jbit.shopping3;


public class GetPrize {
	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.print("输入张浩的Java成绩：");
		int score1 = input.nextInt();
		System.out.print("输入张浩的音乐成绩：");
		int score2 = input.nextInt();
		if ((score1>98 && score2>80) || (score1==100 && score2>70)) {
			System.out.println("老师说：不错，奖励一个MP3");
		}else{
			System.out.println("老师说：太垃圾了，给我抄编码100遍");*/
			int a = 2;
			int b = 3;
			int c = b+a++;
			int c1 = ++a + b;
			int d = (a++) + (--b) + (++a);
			System.out.println(c);
			System.out.println(c1);
			System.out.println(d);
			int no1 = 4;
			int no2 = 3;
			int no3 = (no1++) + (--no2) + (++no1);
			System.out.println(no3);
	
	}

}