package algorithm;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {

		/**
		 *  
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int time1;
		int minute1;
		
		System.out.print("시간: ");
		time1 = sc.nextInt();
		System.out.print("분: ");
		minute1 = sc.nextInt();
		
		System.out.println("상근이가 맞춘 알람 : " + time1 + "시" + " " + minute1 + "분");
		
		int time2;
		int minute2;
		
		System.out.print("시간: ");
		time2 = sc.nextInt();
		System.out.print("분: ");
		minute2 = sc.nextInt();
		
		if(minute2 >= 45) {
			System.out.println("창영이식으로 맞춘 알람 : " + time2 + "시" + " " + (minute2 -45) + "분");
		}else {
			System.out.println("창영이식으로 맞춘 알람 : " + (time2 - 1) + "시" + " " +(minute2 + 60
					- 45) + "분");
		}
	}

}
