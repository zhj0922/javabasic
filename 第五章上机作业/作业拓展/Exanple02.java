package work02;

public class Exanple02 {
	public static void main(String[] args) {
		int mult = 1;
		int i = 1;
		do{
			mult *= i;
			i++;
		}while(i <= 10);
		System.out.println(mult);
	}
}
