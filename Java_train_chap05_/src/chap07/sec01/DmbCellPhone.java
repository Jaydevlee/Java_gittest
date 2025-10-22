package chap07.sec01;
//             자식클래스      상속     부모클래스
public class DmbCellPhone extends CellPhone {
	//필드
	int channel; //인스턴스 필드
	
	/*생성자
	//super(){} 자동으로 추가됨, 부모클래스에 생성자가 따로 선언되지 않았기 때문
	DmbCellPhone(){
		super();
	}
	//매개변수 3개를 가진 생성자 선언, 기본생성자 자동 생성x
	//매개변수 String model, String color 는 부모클래스로부터 상속 받음 */
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드선언
	//이 3개의 메소드는 여기에서 선언, 명시적을 보이지 않지만 부모클래스의 메소드를 상속받음
	void turnOn() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void turnOff() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
