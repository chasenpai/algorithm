package algorithm;

import java.util.Scanner;

public class PrintN_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// N부터 1까지 출력
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
				
		for(int i = num; i > 0; i--) {
					System.out.println(i);
		}
	}

}
