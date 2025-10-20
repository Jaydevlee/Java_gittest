package chap06.chap6_4.연습문제;

import java.util.Scanner;

public class CalculartorTest2 {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 2개와 연산자를 입력: ");
		int num1 = s.nextInt();
		String op = s.nextLine();
		int num2 = s.nextInt();
		double result = 0.0;
		
		if(op.equals("+")) {
			result = myCal.getAdd(num1, num2);
		} else if(op.equals("-")) {
			result = myCal.getSub(num1, num2);
		} else if(op.equals("*")) {
			result = myCal.getADiv(num1, num2);
		} else {
			System.out.println("연산자를 정확히 입력");
		}
		if(op.equals("/")) {
			System.out.printf("연산결과: %.7f %n", result);
		} else {
			System.out.printf("연산결과: %.0f %n", result);
		}
		
	}

}
