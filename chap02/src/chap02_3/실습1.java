package chap02_3;

public class 실습1 {
	public static void main(String[] args) {
		byte a = 10;
		int b = a;
		System.out.println("b: " +b);
		
		char c = '가';
		int d = c;
		System.out.println("c의 유니코드: " +d);
		
		int e = 50;
		long longValue = e;
		System.out.println("longValue: " +longValue);
		
		long g = 100;
		float floatValue = g;
		System.out.println("floatValue: " +floatValue);
		
		float h = 100.5f;
		double doubleValue = h;
		System.out.println("doubleValue: " +doubleValue);
 }
}
