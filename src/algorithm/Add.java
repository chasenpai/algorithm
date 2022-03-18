package algorithm;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("B 입력 : ");
		int b = sc.nextInt();
		
		System.out.println("A + B = " + (a + b));
		
	}

}
