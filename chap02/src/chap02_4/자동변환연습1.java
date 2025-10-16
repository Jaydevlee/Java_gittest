package chap02_4;

public class 자동변환연습1 {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2 (컴파일 오류 why? 정수 연산은 int로 인식함)
		int byteValue3 = byteValue1 + byteValue2;
		System.out.println(byteValue3);
		
		char charValue1 = 'a';
		char charValue2 = 2;
		//char charvalue3 = charValue1 + charValue2
		int intValue = charValue1 + charValue2;
		System.out.println("유니코드: " + intValue);
		System.out.println("출력문자: " + (char)intValue);
		
		int intValue2 = 10;
		int intValue3 = intValue2 / 4;
		System.out.println(intValue3);
		
		int intValue4 = 10;
		//int intValue5 = intValue4 / 4.0
		double doubleValue = intValue4 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double)x / y;
		System.out.println(result);
	}
}
