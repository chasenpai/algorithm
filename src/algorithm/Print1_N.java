package algorithm;

import java.util.Scanner;

public class Print1_N {

	public static void main(String[] args) {
		
		// 1부터 N까지 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println(i + 1);
		}
	}

}
