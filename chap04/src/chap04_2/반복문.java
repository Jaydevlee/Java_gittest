package chap04_2;

public class 반복문 {

	public static void main(String[] args) {
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
					if(lower == 'g') {
						break Outter; //이 구문을 바깥쪽 반복문에 적용 -> 별칭 적용
					}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
