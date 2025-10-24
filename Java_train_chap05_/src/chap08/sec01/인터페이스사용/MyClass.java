package chap08.sec01.인터페이스사용;

public class MyClass {
	//필드
	//참조타입 필드
	RemoteControl rc = new Television();
	
	//생성자
	MyClass(){
		
	}
	//생성자의 매개값으로 지정
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드 내부 로컬변수
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
	}
	//메소드의 매개변수로 지정 
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
