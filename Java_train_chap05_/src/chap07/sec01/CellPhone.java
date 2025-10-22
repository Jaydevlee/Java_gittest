package chap07.sec01;

public class CellPhone {
	//필드
	String model; //인스턴스 필드
	String color; //인스턴스 필드
	
	//생성자
	//생성자가 따로 선언되지 않으면 기본생성자 자동 추가
	//CellPhone () {}
	
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방 " + message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
