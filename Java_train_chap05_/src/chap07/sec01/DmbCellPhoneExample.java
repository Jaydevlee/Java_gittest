package chap07.sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		//메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("안녕하세요.");
		dmbCellPhone.receiveVoice("반갑습니다.");
		dmbCellPhone.hangUp();
		dmbCellPhone.turnOn();
		dmbCellPhone.changeChannel(39);
		dmbCellPhone.turnOff();

	}

}
