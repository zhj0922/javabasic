package work02;

public class Example01 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(i <= 100){
			sum += i;
			i++;
		}
		System.out.println(sum);
		System.out.println("* * * * * * * * *");
		int sum1 = 0;
		int j = 0;
		do{
			sum1 += j;
			j++;
		}while(j <= 100);
		System.out.println(sum1);
	}
}
