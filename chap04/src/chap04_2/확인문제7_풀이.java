package chap04_2;

import java.util.Scanner;

public class 확인문제7_풀이 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			//입력칸 만들기
			String select = scanner.nextLine(); // 사용자가 입력한 선택을 저장하기 위한 변수
			
			//if 문
			//예금 선택
			if (select.equals("1")) {
				System.out.print("예금> ");//예금 잔고 + 사용자가 입력한금액
				balance += Integer.parseInt(scanner.nextLine());
			} else if (select.equals("2")) {
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
			} else if (select.equals("3")) {
				System.out.print("잔고> ");//예금 잔고 + 사용자가 입력한금액
				System.out.print(balance);
			} else if (select.equals("4")) {
				run = false;
				break;
			} else {
				//1-4 중 하나의 숫자만 입력
			}
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
