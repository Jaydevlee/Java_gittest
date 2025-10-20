package chap06.chap6_4.연습문제;

public class Student {
	//학생이름
	String name;
	//반
	int ban;
	//국어점수
	int kor;
	//영어
	int eng;
	//수학
	int math;
	
	Student(String name, int ban, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		int sum = 0;
		sum += (kor + eng + math);
		return sum;
	}
	
	float getAverage() {
		float sum = getTotal();
		float avg = sum / 3;
		return avg;
	}
}
