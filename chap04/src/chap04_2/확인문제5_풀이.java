package chap04_2;

public class 확인문제5_풀이 {

	public static void main(String[] args) {
		//중첩 for반복문 활용
		for(int i=1; i<=4; i++) { // 반복 횟수 만큼 줄바꿈
			for(int j=1; j<=i; j++) {
				System.out.print("*"); //반복 횟수만큼 입력
				if(i==j) {
					System.out.println();
				}
			}
		}

	}

}
