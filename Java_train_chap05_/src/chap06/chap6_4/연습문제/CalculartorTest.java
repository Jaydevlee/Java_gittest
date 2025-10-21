package chap06.chap6_4.연습문제;

import java.util.Scanner;

public class CalculartorTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calculator myCalc = new Calculator();
		
		System.out.print("연산하려는 두 수와 연산자를 입력: ");
		double num1 = s.nextDouble();
		String op = s.nextLine();
		double num2 = s.nextDouble();
		double result = 0;
		
		if(op.equals("+")) {
			result = myCalc.getAdd(num1, num2);
		} else if (op.equals("-")) {
			result = myCalc.getSub(num1, num2);
		} else if (op.equals("*")) {
			result = myCalc.getSub(num1, num2);
		}
		if (op.equals("/")) {
			if(num2 != 0) {
				result = myCalc.getADiv(num1, num2);
			} else {
				System.out.println("무한대");
			}
		}
		System.out.println("연산결과: " + result);
		s.close();
	}

}
