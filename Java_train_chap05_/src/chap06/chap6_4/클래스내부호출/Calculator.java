package chap06.chap6_4.클래스내부호출;

public class Calculator {
	//메소드
	int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg (int x, int y) {
		double sum = plus(x, y);
		double result  = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	void println(String Message) {
		System.out.println(Message);
	}
}
