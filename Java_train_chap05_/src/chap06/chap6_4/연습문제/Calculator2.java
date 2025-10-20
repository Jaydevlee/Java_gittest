package chap06.chap6_4.연습문제;


public class Calculator2 {
	//실수용 오버로딩
	double cal(double num1, double num2, String op) {
		switch(op) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 + num2;
		case "*":
			return num1 + num2;
		case "/":
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return 0.0;
			}
			return num1 / num2;
		default:
			System.out.println("잘못된 연산자입니다.");
			return 0.0;
		}
	}
	//정수용 오버로딩
	int cal(int num1, int num2, String op) {
		switch(op) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 + num2;
		case "*":
			return num1 + num2;
		case "/":
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.")
				return 0;
			}
			return num1 / num2;
		default:
			System.out.println("잘못된 연산자입니다.");
			return 0;
		}
	}
}
