package chap03_1;

public class 연산자reminde {
	public static void main(String[] args) {
		int a  = 10 + 20;
		int b = -10;
		String c = "홍길동" + 10;
		int d = a++;
		boolean e = a == b;
		String f = (a>b)?"a가 큽니다.":"b가 큽니다.";
			
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
