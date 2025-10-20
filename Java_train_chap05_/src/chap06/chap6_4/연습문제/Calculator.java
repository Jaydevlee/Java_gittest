package chap06.chap6_4.연습문제;

public class Calculator {
	int x;
	int y;
	
	Calculator(int x, int y){
		this.x = x;
		this.y = y;
	}
	//getAdd
	int getAdd() {
		int sum = x + y;
		return sum;
	}
	int getSub() {
		int sub = x - y;
		return sub;
	}
	int getMul() {
		int mul = x * y;
		return mul;
	}
	double getDiv() {
		double div = (double) x / y;
		return div;
	}
	
	
}
