package chap05.chap05_2;

import java.util.Scanner;

public class 확인문제6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		int i = 0;
		int max = 0;
		double avg = 0;
		
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				//학생수 입력
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum]; //배열 길이 지정
				
			} else if (selectNo == 2) {
				for(i = 0; i < scores.length; i++) { //학생 수 만큼 성적 입력
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if (selectNo == 3) {
				for(i = 0; i < scores.length; i++) { //성적 표시
				System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if (selectNo == 4) {
				//최고점수 
				for(i = 0; i < scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				//평균
				
				avg  = (double) sum / scores.length;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
		scanner.close();
	}

}
