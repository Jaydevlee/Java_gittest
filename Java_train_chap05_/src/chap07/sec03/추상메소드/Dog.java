package chap07.sec03.추상메소드;

public class Dog extends Animal {
	//필드 animal 에서 상속
	
	//생성자
	public Dog() {
		this.kind = "포유류";
	}
	//추상 메소드 재정의
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
