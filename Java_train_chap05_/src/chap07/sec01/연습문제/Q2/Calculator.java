package chap07.sec01.연습문제.Q2;

public class Calculator {

	public static void main(String[] args) {
		SubHealth cal = new SubHealth(0.0, 0.0, null);
		cal.input();
		cal.output1();
		if(cal.gender == 'M' || cal.gender == 'F' || cal.gender == 'm' || cal.gender == 'f') {
			cal.output2();
		}
	}

}
