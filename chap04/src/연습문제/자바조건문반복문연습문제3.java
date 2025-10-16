package 연습문제;

import java.util.Scanner;

public class 자바조건문반복문연습문제3 {

	public static void main(String[] args) {
		//1과 100사이의 값입력
		Scanner scanner = new Scanner(System.in);
		
		//컴퓨터가 생각한 값을 변수에 저장
		int com = (int)(Math.random() * 100) + 1;
		//시도횟수 저장 변수
		int cunt = 0;
		boolean run = true;
		//입력값과 컴퓨터값 비교 반복(while), 조건 반복횟수가 정해지지 않음 그러니까 while 쓴거다
		while (run) {
			System.out.println("1과 100사이의 값을 입력하세요.");
			int nums = Integer.parseInt(scanner.nextLine());
			if(nums < com) {
				System.out.println("더 큰 수를 입력하세요.");
				cunt++;
			} else if (nums > com) {
				System.out.println("더 작은 수를 입력하세요.");
				cunt++;
			} else {
				System.out.println("맞췄습니다.");
				cunt++;
				break;
			}
		} System.out.println("시도횟수는 " + cunt + "입니다."); 
			scanner.close();
	}
}