package work02;

public class Example03 {
	public static void main(String[] args) {
		double paper = 0.08;
		int sum = 0;
		do{
			sum = 1 + sum;
			paper *= 2;
		}while(paper <= 8848.13 * 1000);
		System.out.println(sum);
	}
}
