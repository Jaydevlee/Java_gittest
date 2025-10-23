package chap07.sec01.연습문제.Q1;

public class SubEntryExample {

	public static void main(String[] args) {
		//생성자 호출은 생성한 객체의 생성자 매개변수에 맞춰야 한다.
		SubEntry subEntry = new SubEntry("OOP", "Object Oriented Programming", 1991);
		
		subEntry.printView();

	}

}
