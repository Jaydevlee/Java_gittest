package chap02_4;

import java.util.Scanner;

public class 입력_스캐너 {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in); //Scanner: 객체
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine(); //scanner: 객체 nextLine(): 메서드
			System.out.println("입력된 문자열: \"" + inputData + "\""); 
			if(inputData.equals("q")) { //Java는 기본 타입의 값이 동일한지 비교할 경우에 ==를 사용, 문자열이 동일한지 비교할 경우 equals 사용
				break; //equals String의 메서드 equals 는 ===과 같다.
			}
		}
		System.out.println("종료");
		scanner.close();
	}
	
}
