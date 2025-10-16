package 연습문제;

import java.util.ArrayList; //배열길이 지정x
import java.util.Scanner;

public class 자바조건문반복문연습문제1_풀이2_배열활용 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> divisor = new ArrayList<>(); //배열선언
		int cunt = 0;
		
		int num1 = 36;
		
		//배열 활용 o
		for(int i = 1; i <= num1; i++) {
			if(num1 % i == 0) {
				divisor.add(i);
				cunt++;
			}
			
		} System.out.println(divisor);
		System.out.println("약수의 개수는 " + cunt + "개 입니다."); 

		scanner.close();
	}
}
