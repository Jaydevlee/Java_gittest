package chap07.sec01.연습문제.Q1;

public class SubEntry extends Entry {
	//필드
	String definition; //인스턴스 필드
	int year; //인스턴스 필드
	//생성자(매개변수 3, w 상속)
	SubEntry(String w, String d, int y) {
		super(w);
		this.definition = d;
		this.year = y;
	}
	//메소드 (오버라이드)
	@Override
	public void printView() {
		System.out.println("*****약어사전*****");
		System.out.println("약어 : " + word);
		System.out.println("원어: " + definition);
		System.out.println("시기: " + year);
	}
}
	

