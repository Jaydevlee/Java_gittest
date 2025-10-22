package chap07.sec01.연습문제.Q1;

public class Entry {
	//필드
	String word; //인스턴스 필드
	//생성자 (매개변수1)
	Entry(String w) {
		this.word = w;
	}
	//메소드
	public void printView() {
		System.out.println("약어 : " + word);
	}
}
