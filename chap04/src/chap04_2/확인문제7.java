package chap04_2;

import java.util.Scanner;

public class 확인문제7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			String inputData = scanner.nextLine();
			//if 문
			if (inputData.equals("1")) {
				System.out.println("예금액> " + balance);
			} else if (inputData.equals("2")) {
				System.out.println("출금액> " + balance);
			} else if(inputData.equals("3")) {
				System.out.println("잔고> " + balance);
			} else {
				System.out.println("프로그램 종료");
				break;
			} 
		}
		
		
		scanner.close();
	}

}
