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
	/*풀이
	 * SubEntry(String w){
	 * super(w);
	 * } 
	 * SubEntry(String w, String d, int y) {
		super(w);
		this.definition = d;
		this.year = y;
		}
		생성자 오버로딩: 객체를 생성해서 다양한 상황에서 생성할 수 있다.
	 */
	
	//메소드 (오버라이드)
	@Override
	public void printView() {
		System.out.println("*****약어사전*****");
		System.out.println("약어 : " + word);
		System.out.println("원어: " + definition);
		System.out.println("시기: " + year);
	}
}
	

