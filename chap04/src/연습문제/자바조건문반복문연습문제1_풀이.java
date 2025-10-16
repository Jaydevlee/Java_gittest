package 연습문제;

import java.util.Scanner;

public class 자바조건문반복문연습문제1_풀이 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int cunt = 0;
		
		System.out.print("입력: ");
		int num1 = Integer.parseInt(scanner.nextLine());
		
		//배열 활용 x
		System.out.print("{");
		for(int i = 1; i <= num1; i++) {
			if(num1 % i == 0) {
				cunt++;
				if(num1 == i) {
					System.out.print(i);
				} else {
					System.out.print(i + ",");	
				}		
			}
		} System.out.println("}");
		System.out.println("약수의 개수는 " + cunt + "개 입니다.");
		scanner.close();
	}
}
