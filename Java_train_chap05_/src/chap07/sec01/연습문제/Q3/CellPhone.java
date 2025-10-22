package chap07.sec01.연습문제.Q3;

import java.util.Scanner;

public class CellPhone {
	//필드
	String model;
	String color;
	Scanner s = new Scanner(System.in);
	//부모 메소드
	void powerOn(){
		System.out.println("전원을 켭니다");
	}
	void powerOff(){
		System.out.println("전원을 끕니다");
	}
	void hangOn(){
		System.out.println("벨이 울립니다");
	}
	void sendVoice(String message){
		System.out.println("나: " + message);
	}
	void receiveVoice(String message){
		System.out.println("상대방" + message);
	}
	void hangUp(){
		System.out.println("전화를 끊습니다.");
	}
	
	//전화 응답 메소드
	void call() {	
		while(true) {
		System.out.println("-------------------------------");
		System.out.println("1. 말한다. 2. 듣는다. 3. 전화를 끊는다.");
		System.out.println("-------------------------------");
		System.out.print("1, 2, 3번 중 하나를 선택하세요. > ");
		int select1 = Integer.parseInt(s.nextLine());
		
		switch(select1) {
			case 1:
				System.out.print("상대방에게 하고자 하는 메세지를 입력하세요.");
				String message = s.nextLine();
				sendVoice(message);
				break;
			case 2:
				System.out.print("상대방이 하고자 하는 메세지를 입력하세요.");
				String message1 = s.nextLine();
				receiveVoice(message1);
				break;
			case 3:
				System.out.println("전화를 끊습니다.");
				return;
			}
		}
	}
}