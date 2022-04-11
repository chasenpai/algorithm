package algorithm;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int quadrant = 0;
		int x = 0, y = 0;
		System.out.print("x축을 입력하세요: ");
		x = scanner.nextInt();
		System.out.print("y축을 입력하세요: ");
		y = scanner.nextInt();
		
		if(x == 0 && y == 0) {
			System.out.println("원점입니다.");
		} else {
			if(x > 0 && y > 0) {
				quadrant = 1;
			} else if(x < 0 && y > 0) {
				quadrant = 2;
			} else if(x < 0 && y < 0) {
				quadrant = 3;
			} else {
				quadrant = 4;
			} System.out.println(quadrant + "사분면");
		}

	}
}
