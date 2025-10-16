package chap02_2;
public class CChar {
	public static void main(String[] args) {
		char c1 = 'A';
		int c2 = 'A';
		char c3 = 65;
		char c4 = '\u0041';
		
		char c5 = '가';
		int c6 = '가';
		char c7 = 44032;
		char c8 = '\uac00';
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
	}
}
