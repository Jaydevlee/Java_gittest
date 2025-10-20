package chap06.chap6_4;

public class Calculator {
	//메소드
	void powerOn() {
		System.out.println("전원 on");
	} //void는 return이 있을 수도 있고, 리턴이 있으나 값이 없는 경우가 있다.
	
	int plus(int x, int y) {
		int result = x + y;
		return result; //호출한 곳으로 리턴값을 보낸다.
	} // return 타입을 일치시켜줌
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() { 
		System.out.println("전원 off");
	}
}
