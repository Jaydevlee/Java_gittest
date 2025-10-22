package chap07.sec01.생성자상속;

public class People {
	//필드
	public String name; //인스턴스 필드
	public String ssn; //인스턴스 필드
	
	//생성자(매개변수2개), 기본생성자x
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	//메소드 없음
}
