package chap06.chap6_4.연습문제;

import java.util.Scanner;

public class Calculator2 {
	    int x;
	    int y;
	    Scanner scanner;

	    public Calculator(int x, int y, Scanner scanner) {
	        this.x = x;
	        this.y = y;
	        this.scanner = scanner;
	    }

	    public int getAdd() { return x + y; }
	    public int getSub() { return x - y; }
	    public int getMul() { return x * y; }
	    public double getDiv() { return (double) x / y; }

	    public void cal() {
	        System.out.print("첫 번째 숫자 입력: ");
	        int num1 = scanner.nextInt();
	        System.out.print("두 번째 숫자 입력: ");
	        int num2 = scanner.nextInt();
	        scanner.nextLine(); // 버퍼 비우기

	        System.out.print("연산자 입력 (+, -, *, /): ");
	        String op = scanner.nextLine();

	        Calculator newCalc = new Calculator(num1, num2, scanner);

	        switch (op) {
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
	                System.out.println("결과: " + newCalc.getDiv());
	                break;
	            default:
	                System.out.println("잘못된 연산자입니다.");
	        }
	    }
	}
