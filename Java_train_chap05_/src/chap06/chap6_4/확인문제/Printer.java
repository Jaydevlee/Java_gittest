package chap06.chap6_4.확인문제;

public class Printer {
	//메소드 선언
	void println(int x) {
		System.out.println(x);
		//외부클래스에 출력문이 따로 없기 때문에 reture x
	}
	
	void println(boolean y) {
		if(y == true) {
			System.out.println(true);
		}
		
	}
	
	void println(double z) {
		System.out.println(z);
	}
	
	void println(String str) {
		System.out.println(str);
	}
	
	
}
