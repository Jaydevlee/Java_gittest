package chap02_3;

public class 문자열_기본형_강제변환 {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		long value2 = Long.parseLong("4000000000");
		double value3 = Double.parseDouble("3.14");
		boolean value4 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}
}
