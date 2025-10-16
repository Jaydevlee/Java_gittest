package 연습문제;

public class Q1 {

	public static void main(String[] args) {
		byte byteValue = 10;
		char charValue = 'A';
		
		int intValue = byteValue;
		int intValue2 = charValue;
		short shortValue = (short)charValue;
		double doubleValue = byteValue;

		System.out.println(intValue);
		System.out.println(intValue2);
		System.out.println(shortValue);
		System.out.println(doubleValue);
	}

}
