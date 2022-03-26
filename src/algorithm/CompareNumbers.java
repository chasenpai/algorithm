package algorithm;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {

		//입력받은 두 숫자 크기 비교하기
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 0, b = 0;
		System.out.println("a와 b를 입력하세요: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if(a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		

		
	}
}
