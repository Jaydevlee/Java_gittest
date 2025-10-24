package chap07.sec03.추상메소드;

public abstract class Animal {
	//필드
	public String kind;
	
	//생성자

	//일반 메소드
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	//추상 메소드
	//추상 메소드는 실행 내용은 작성하지 않는다.
	public abstract void sound();
}
