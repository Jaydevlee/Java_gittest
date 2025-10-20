package chap06.chap6_4.연습문제;

import java.util.Scanner;

public class Calculator {
	int x;
	int y;

	Calculator(int x, int y){
		this.x = x;
		this.y = y;
	}
	//getAdd
	int getAdd() {
		int sum = x + y;
		return sum;
	}
	int getSub() {
		int sub = x - y;
		return sub;
	}
	int getMul() {
		int mul = x * y;
		return mul;
	}
	double getDiv() {
		double div = (double) x / y;
		return div;
	}
	
	void cal() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력: ");
		int num1 = scanner.nextInt();
		System.out.print("두 번째 숫자 입력: ");
		int num2 = scanner.nextInt();
		scanner.nextLine();
		System.out.print("연산자 입력: ");
		String op = scanner.nextLine();
		//입력값으로 새로운 객체 생성
		Calculator newCalc = new Calculator(num1, num2);
		
		switch(op) {
		case "+":
			System.out.println("결과: " + newCalc.getAdd());
			break;
		case "-":
			System.out.println("결과: " + newCalc.getSub());
			break;
		case "*":
			System.out.println("결과: " + newCalc.getMul());
			break;
		case "/":
			if(num2 != 0) {
				System.out.println("결과: " + newCalc.getDiv());
			} else {
				System.out.println("결과: 무한대");
			}
			break;
		default:
			System.out.println("잘 못된 연산자 입니다.");
		
		}
		scanner.close();
	}
}
