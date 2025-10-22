package chap07.sec01.메소드재정의;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객제의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
}
