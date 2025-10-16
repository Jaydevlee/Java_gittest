package chap02_3;

public class 연산타입변환3 {
	public static void main(String[] args) {
		// java에서 정수 연산결과는 정수가 된다
		int x = 1;
		int y = 2;
		double result2 = (double) x / y; // (double) (x / y)는 0이 나온다. (x / y) 먼저 계산하고 double 로 변환되기 때문
		System.out.println(result2);
	}
}