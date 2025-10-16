package chap04_2;

public class 확인문제6_풀이 {

	public static void main(String[] args) {
		//중첩 for반복문 활용
		for(int i = 1; i <= 4; i++) { // 반복 횟수 만큼 줄바꿈
			for(int j = 4; j > 0; j--) { //칸번호
				if(i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
