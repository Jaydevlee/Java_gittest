package chap10.연습문제;

import java.util.Scanner;

public class 연습문제1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//시도 횟수 저장 변수
		int cnt = 0;
		//사용자 입력값 저장 변수
		int num = 0;
		//컴퓨터가 생각한값
		int com = (int)(Math.random() * 100 + 1);
		boolean run = true;
		while(run) {
			//사용자 입력 숫자
			try {
			System.out.print("1과 100사이 숫자를 입력하세요: ");
			num = Integer.parseInt(s.nextLine());
			if(num > com) {
				++cnt;
				System.out.println("더 작은 수를 입력하세요.");
			} else if(num < com) {
				++cnt;
				System.out.println("더 큰 수를 입력하세요.");
			} else {
				++cnt;
				System.out.println("정답!");
				System.out.println(cnt + "번만에 맞추셨습니다.");
				run = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력할 수 있습니다.");
				}	 
			}
		s.close();
	}

}
