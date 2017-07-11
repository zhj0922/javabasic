package cn.jbit.shopping7;

public class P164_Example03 {
	public static void main(String[] args) {
		int[]  points ={18,25,7,36,13,2,89,63};
		int min = points[0];
		int index = points.length;
		for(int i = 0; i < points.length; i++){
			if(points[i] < min){
				min = points[i];
				index = i;	
			}
		}
		System.out.println("ÏÂ±êÎª£º"+index);
		System.out.println(min);
	}
}
