package chap07.sec01.메소드재정의;

public class Calculator {
	//필드x
	//생성자x, 기본생성자
	
	//메소드 리턴이 필요한 메서드
	double areaCircle(double r) { //인스턴스 메소드 호출 시 new 키워드 필요
		System.out.println("Calculator 객제의 areaCircle() 실행");
		return 3.14156 * r * r;
	}
}
