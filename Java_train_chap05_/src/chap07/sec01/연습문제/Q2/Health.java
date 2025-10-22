package chap07.sec01.연습문제.Q2;

import java.util.Scanner;

public class Health {
	//필드
	//메소드 내부에서 스캐너 객체 생성하면 꼬일수 있어서 전역변수로 선언하는 것이 좋다
	Scanner s = new Scanner(System.in);
	char gender; //성별
	double tall; //신장
	double weight; //체중
	
	//생성자, 기본 생성자
	//메서드
	//입력 메서드
	void input() {
		//성별 입력
		System.out.print("성별(M/F): ");
		gender = s.nextLine().charAt(0); //string to char 형변환
		//신장 입력
		System.out.print("신장(cm): ");
		tall = s.nextDouble();
		s.nextLine();
		//체중 입력
		System.out.print("체중(kg): ");
		weight = s.nextDouble();
		
	}
	void output1() {
		System.out.println("성별 - " + gender);
		System.out.println("신장 - " + tall + "cm");
		System.out.println("체중 - " + weight + "kg");
	}
}
