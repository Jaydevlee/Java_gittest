package chap03_1;

public class 연산자실습 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		String result = a + b > c++ && a + b < c-- || a * b == 150 ? "A":"B";
		// 단항 -> 이항 -> 삼항
		// 산술 -> 비교 -> 논리 -> 대입
		/*
		 연산순서: C++ -> a+b -> c-- -> a+b -> a*b -> (a + b > c++) (false) -> a + b < c-- (false)
		         -> a * b == 150(false) -> false && false || false 비교 -> 조건 false 
		         -> B -> B를 result에 대입
		 */
		System.out.println(result);
	}

}
