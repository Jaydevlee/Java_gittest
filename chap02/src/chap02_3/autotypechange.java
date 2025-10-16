package chap02_3;

public class autotypechange {
	public static void main(String[] args) {
		int a = 10;
		float b = a;
		System.out.println(b);
		
		char c = '가';
		int d = c;
		System.out.println(d);
		
		int e = 65;
		char f = (char)e;
		System.out.println(f);
		
		byte g = 65;
		char h = (char)g;
		System.out.println(h);
	}
}
