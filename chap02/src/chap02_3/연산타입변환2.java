package chap02_3;

public class 연산타입변환2 {
	public static void main(String[] args) {
		// 모든 변수가 int로 변환되는 것은 아님, 다른 타입의 변수 중 더 큰 타입으로 변환된다.
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);
	}
}
