package chap07.sec01.생성자상속;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		
		System.out.println("이름:" + student.name);
		System.out.println("주민등록번호: " + student.ssn);
		System.out.println("studentNo: " + student.studentNo);

	}

}
