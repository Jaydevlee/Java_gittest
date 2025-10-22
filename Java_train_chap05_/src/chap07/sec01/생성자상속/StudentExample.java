package chap07.sec01.생성자상속;

public class StudentExample {

	public static void main(String[] args) {
		//객체 생성 및 student 생성자 호출
		Student student = new Student("홍길동", "123456-1234567", 1);
		
		
		System.out.println("이름:" + student.name); //이름 출력
		System.out.println("주민등록번호: " + student.ssn); //주민번호 출력
		System.out.println("studentNo: " + student.studentNo); //번호 출력

	}

}
