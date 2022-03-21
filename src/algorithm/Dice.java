package algorithm;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random random1 = new Random();

		int max = 6;
		int min = 1;
		
		int[] values = new int[3];
		
		for(int i = 0; i < 3 ; i ++) {
	
			 values[i] = random1.nextInt(max) + min;
			if(values[i] == 0) {
				values[i] = random1.nextInt(6);
			}else {
				System.out.println("주사위 값: " + values[i]);
			}
		}
		
		int maxValue = values[0];
		
		for(int i = 1; i<values.length; i++) {
				if(values[i]>maxValue) {
					maxValue = values[i];
				}
		}
		
		if(values[0] == values[1] && values[0] == values[2]) {
			System.out.println("상금: " + (10000 + (values[0] * 1000) ));
		}else if(values[0] == values[1] || values[0] == values[2]) {
			System.out.println("상금: " + (1000 +(values[0] * 100)));
		}else if(values[1] == values[2]) {
			System.out.println("상금: " + (1000 +(values[1] * 100)));
		}else {
			System.out.println("상금:" + (maxValue * 100));
		}
	}

}
