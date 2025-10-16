package chap02_3;

public class 연산타입변환 {
	public static void main(String[] args) {
		// int 보다 작은 byte, short는 연산식에서 변수가 피연산자로 사용되면 int로 자동 변환되어 연산 수행
		byte result = 10 + 20; 
		System.out.println(result); //정수 리터럴을 덧셈 한 것이믈 컴파일 오류가 발생하지 않음
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
	}
}
