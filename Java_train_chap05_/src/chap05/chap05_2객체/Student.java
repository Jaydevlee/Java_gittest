package chap05.chap05_2객체;

public class Student {
	//객체 = 속성(변수) + 메소드(함수)
	//이름 변수
	String name;
	//국어점수
	int kor;
	//영어점수
	int eng;
	//수학점수
	int math;
	
	//메소드
	//개인별 총점 계산
	int total() {
		//국+영+수
		return kor + eng + math;
	}
	//개인별 평균 계산
	double avg() {
		//국+영+수
		return (kor + eng + math) / 3.0;
	}
}
