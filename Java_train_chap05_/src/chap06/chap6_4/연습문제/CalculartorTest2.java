package chap06.chap6_4.연습문제;

import java.util.Scanner;

public class CalculartorTest2 {

	public static void main(String[] args) {
		Calculator2 myCal = new Calculator2();
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자 2개와 연산자를 입력: ");
		String s1 = s.nextLine();
		String op = s.nextLine();
		String s2 = s.nextLine();
		
		double result = 0.0;
		//둘 중 하나라도 실수면 double 메소드 호출
		boolean isDouble = s1.contains(".") || s2.contains(".");
		
		if(isDouble) {
			double n1 = Double.parseDouble(s1);
			double n2 = Double.parseDouble(s2);
			result = myCal.cal(n1, n2, op);
		} else {
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			result = myCal.cal(n1, n2, op);
		}
		
		if(result % 1 == 0) {
			System.out.printf("연산결과: %.0f %n", result);
		} else {
			System.out.printf("연산결과: %.7f %n", result);
		}
		
	}

}
