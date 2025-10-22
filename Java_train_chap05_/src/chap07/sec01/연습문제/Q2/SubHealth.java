package chap07.sec01.연습문제.Q2;

public class SubHealth extends Health {
	//필드
	double s_weight; //표준체중
	double fat; //비만도
	String result; //결과값
	
	//생성자
	SubHealth(double s_weight, double fat, String result) {
		this.s_weight = 0.0;
		this.fat = 0.0;
		this.result = null;
	}
	//메소드
	void calculate() {
		//성별에 따른 표준체중 계산
		if(gender == 'M' || gender == 'm') {
			s_weight = (tall - 100) * 0.9;
		} else if(gender == 'F' || gender == 'f') {
			s_weight = (tall - 100) * 0.85;
		} else {
			System.out.println("성별을 정확히 입력");
		}
		//비만도 계산
		fat = (weight / s_weight) * 100;
		if(fat <= 90) {
			result = "저체중";
		} else if(fat <= 110){
			result = "정상(표준체중)";
		} else if(fat <= 120){
			result = "과체중";
		} else if(fat <= 130){
			result = "경도비만";
		} else if(fat <= 150){
			result = "중도비만";
		} else {
			result = "고도비만";
		}
	}
	//최종 결과 출력
	void output2() {
		System.out.println("***** 비만도 Check *****");
		super.input();
		calculate();
		System.out.println();
		super.output1();
		System.out.println();
		System.out.println("당신은 비만도 " + fat + "이고 " + result + "입니다.");
	}
}

