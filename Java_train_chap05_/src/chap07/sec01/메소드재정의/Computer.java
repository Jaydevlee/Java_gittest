package chap07.sec01.메소드재정의;
//             자식      상속       부모
public class Computer extends Calculator{
	//메소드 재정의 오버라이드
	@Override
	double areaCircle(double r) { //인스턴스 메소드 호출 시 new 키워드 필요
		System.out.println("Computer 객제의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
}
