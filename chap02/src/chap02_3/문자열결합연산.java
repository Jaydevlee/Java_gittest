package chap02_3;

public class 문자열결합연산 {
	public static void main(String[] args) {
		// 숫자연산
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		//문자열 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3);
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4: " + str4);
		// +연산이 연이어 나오면 순차적으로 수행,
		// 먼저 수행된 연산이 덧셈이면 그 결과를 가지고 다음 연산 수행
		// 먼저 수행된 연산이 결합 연산이면 이후 +연산 모두 결합연산
	}
}
