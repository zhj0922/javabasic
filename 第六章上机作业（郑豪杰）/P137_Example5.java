package cn.jbit.shopping6;

public class P137_Example5 {
	public static void main(String[] args) {
		int men;
		int women;
		int kids;
		for (men = 0; men <= 10; men++) {
			for (women = 0; women <= 25; women++) {
				kids = 30 - men - women;
				if (3 * men + 2 * women + kids == 50) {
					System.out.println("���ˣ�" + men);
					System.out.println("Ů�ˣ�" + women);
					System.out.println("С����" + kids + "\n");
				}
			}
		}
	}
}
