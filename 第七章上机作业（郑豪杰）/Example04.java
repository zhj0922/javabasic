package cn.jbit.shopping7;

public class Example04 {
	public static void main(String[] args) {
		int[][] scores = new int[][]{{90,85,92,78,54},{76,63,80},{87,62}};
		int sum;                //每个班总成绩
		for(int i = 0; i < scores.length; i++){
			String str = (i + 1)+"班";
			sum = 0;
			for(int j = 0; j < scores[i].length; j++){
				sum = sum + scores[i][j];
			}
				System.out.println(str+"班总成绩："+sum);
		}
		double[] price = new double[5];
		price[0] = 98.10;
		price[1] = 32.16;
		for(int i = 0; i < 5; i++){
			System.out.print((int)price[i]+" ");
		}
		int[] a = new int[3];
		int[] b = new int[]{1,2,3,4,5};
		a = b;
		for(int i = 0; i < b.length; i++){
			System.out.print("\n"+a[i]+" ");
		}
	}
}
