package 연습문제;

import java.util.ArrayList;
import java.util.Scanner;

public class 자바조건문반복문연습문제1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> divisor = new ArrayList<>();
		
		System.out.print("입력: ");
		int num1 = Integer.parseInt(scanner.nextLine());
		
		for(int i = 1; i <= num1; i++) {
			if(num1 % i == 0) {
				divisor.add(i);
			}
			
		} System.out.println(divisor);
		System.out.println("약수의 개수는 " + divisor.size() + "개 입니다.");
	}

}
