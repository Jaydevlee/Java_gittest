package chap07.sec01.연습문제.Q3;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	
	//생성자(매개변수3)
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//dmb 기능
	void turnOn() {
		System.out.println("DMB방송 수신을 시작합니다.");
	}
	void changeChannel(int channel) {
		System.out.println("채널을" + channel +"로 변경합니다.");
	}
	void turnOff() {
		System.out.println("DMB방송 수신을 종료합니다.");
	}
	
}
