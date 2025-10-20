package chap06.chap6_4.연습문제;

import java.util.Scanner;

public class Calculator2 {
	Scanner scanner = new Scanner(System.in);
	int num1;
	int num2;
	
	int cal(){
		System.out.print("첫번째 숫자를 입력: ");
		num1 = scanner.nextInt();
		System.out.print("첫번째 숫자를 입력: ");
		num2 = scanner.nextInt();
		scanner.nextLine();
		System.out.print("연산자를 입력: ");
		String op = scanner.nextLine();
		int result = 0;
		if(op.equals("+")) {
			result = num1 + num2;
		} else if(op.equals("-")){
			result = num1 - num2;
		} else if(op.equals("*")) {
			result = num1 * num2;
		} else if(op.equals("/")) {
			result = num1 / num2;
		}
		return result;
	}
	double clal() {
		System.out.print("첫번째 숫자를 입력: ");
		num1 = scanner.nextInt();
		System.out.print("첫번째 숫자를 입력: ");
		num2 = scanner.nextInt();
		scanner.nextLine();
		System.out.print("연산자를 입력: ");
		String op = scanner.nextLine();
		int result = 0;
		if(op.equals("+")) {
			result = num1 + num2;
		} else if(op.equals("-")){
			result = num1 - num2;
		} else if(op.equals("*")) {
			result = num1 * num2;
		} else if(op.equals("/")) {
			result = num1 / num2;
		}
		return result;
	}

	}
