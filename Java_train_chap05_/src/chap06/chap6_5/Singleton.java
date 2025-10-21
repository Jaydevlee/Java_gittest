package chap06.chap6_5;

public class Singleton {
	//정적필드
	private static Singleton singleton = new Singleton();
	
	//외부 클래스로부터 생성자로 접근할 수 없도록 private
	private Singleton() {} //싱글톤 생성 생성자 앞에 private 키워드
	
	static Singleton getInstance() {
		return singleton;
	}
}
