package cn.jbit.shopping6;

public class P136No_Example04 {
	public static void main(String[] args) {
		System.err.println("\t\tFlipFlop");
		String name;
		for(int i = 1; i <= 100; i++){
			if(i%3 == 0 && i%5 == 0){
				System.out.println("FlipFlop");
			}else if(i%5 == 0){
				System.out.println("Flop");
			}else if(i%3 == 0){
				System.out.println("Flip");
			}else{
				System.out.println(i);
			}
		}
	}
}
