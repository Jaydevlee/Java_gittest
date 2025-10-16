package chap02_4;

import java.util.Scanner;

public class 확인문제2 {

	public static void main(String[] args) throws Exception {
		// 키보드와 관련이 있는 변수와 메소드를 저장한 Scanner객체
		// Scanner 객체는 다른 package에 있는 객체이므로, 반드시 import를 해야함
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두 번째 수: ");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);

	}

}
