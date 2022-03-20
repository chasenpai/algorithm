package algorithm;

public class Add1_100 {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		for(int i = 0; i <100 ;i++) {
			sum = sum + num;
			num++;	
		}
		System.out.println(sum);
	}

}
