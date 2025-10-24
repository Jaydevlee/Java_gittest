package chap07.sec03.추상메소드;

public class Dog extends Animal {
	//필드 animal 에서 상속
	
	//생성자
	public Dog() {
		this.kind = "포유류";
	}
	//메소드
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
