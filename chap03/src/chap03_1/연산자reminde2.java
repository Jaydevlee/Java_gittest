package chap03_1;

public class 연산자reminde2 {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c1 = a && b;
		boolean c2 = a & b;
		boolean d1 = a || b; // 앞의 값만 확인함
		boolean d2 = a | b; // 앞뒤의 값 두 개다 확인
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(d1);
		System.out.println(d2);
		
		
	}

}
