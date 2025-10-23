package chap07.sec01.연습문제.Q3;

import java.util.Scanner;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//모델, 색상, 채널 입력
		System.out.print("모델명을 입력하세요> ");
		String model = s.nextLine();
		System.out.print("색상을 입력하세요> ");
		String color = s.nextLine();
		System.out.print("채널을 입력하세요> ");
		int channel = s.nextInt();
		s.nextLine(); //입력 버퍼 정리용
		
		//객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone(model, color, channel);
		
		//모델 출력
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		System.out.println("채널: " + dmbCellPhone.channel);
		
		
		//폰 기능
		while(true) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 전원켬 2. 전원끔, 3. 전화받기 4. DMB켜기 5. DMB채널 바꾸기 6. DMB끄기");
			System.out.println("------------------------------------------------------------");
			System.out.print("하고자 하는 기능을 선택하세요. > ");
			int select = Integer.parseInt(s.nextLine());
			
			switch (select) {
			    case 1:
			    	dmbCellPhone.powerOn();
			    	break;
			    case 2:
			    	dmbCellPhone.powerOff();
			    	return;
			    case 3:
			    	dmbCellPhone.call();
			    	break;
			    case 4:
			    	dmbCellPhone.turnOn();
			    	break;
			    case 5:
			    	dmbCellPhone.changeChannel(channel);
			    	break;
			    case 6:
			    	dmbCellPhone.turnOff();
			    	break;
			    	
			}
				
		} 
		
	}

}
