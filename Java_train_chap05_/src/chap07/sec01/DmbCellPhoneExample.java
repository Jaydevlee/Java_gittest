package chap07.sec01;

public class DmbCellPhoneExample {
	//Java는 main메소드가 있는 클래스부터 먼저 실행
	public static void main(String[] args) {
		//DmbCellPhone클래스에서 객체 생성, 생성자를 선언했으므로 매개변수를 맞춰야 한다
		//매개변수 3개인 생성자를 호출
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//상속 받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		//DmbCellPhone 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("안녕하세요.");
		dmbCellPhone.receiveVoice("반갑습니다.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 실행
		dmbCellPhone.turnOn();
		dmbCellPhone.changeChannel(39);
		dmbCellPhone.turnOff();

	}

}
