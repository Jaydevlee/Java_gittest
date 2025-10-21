package sec06.연습문제;

public class MainApp {

	public static void main(String[] args) {
		//Person 객체 생성
		Person p1 = new Person("홍길동", 25);
		
		//setter
		p1.setName("김철수");
		p1.setAge(30);
		
		p1.printInfo();
		
		//잘 못 입력한 정보
		p1.setName("");
		p1.setAge(-5);
		
		p1.printInfo();
	}

}
