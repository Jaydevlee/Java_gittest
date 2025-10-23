package chap07.sec02.필드다형성;

public class Car { //Car클래스와 Tire의 관계 집합관계 (new를 통해 호출), 자동차는 타이어를 가지고 있다. <- 집합관계 / 금호타이어는 타이어다 <- 상속관계
	//필드
	Tire frontLeftTire = new Tire("앞왼", 6);
	Tire frontRightTire = new Tire("앞오", 2);
	Tire backLeftTire = new Tire("뒤왼", 3);
	Tire backRightTire = new Tire("뒤오", 4);
	
	//생성자
	//메소드
	int run() {
		System.out.println("[차가 달립니다.]");
		if(frontLeftTire.roll() == false ) { //사용관계: 다른 클래스의 메소드 호출
			stop ();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop ();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop ();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop ();
			return 4;	
		}
		return 0;
	}
	//차가 멈췄을 때
	void stop() {
		System.out.println("[차가 멈춥니다.]");
	}
}
