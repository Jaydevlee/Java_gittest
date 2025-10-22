package chap07.sec01.생성자상속;
//             자식      상속    부모
public class Student extends People {
	//필드
	public int studentNo; //인스턴스 필드
	
	//생성자 (매개변수3개 / name, ssn 상속받음)
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //부모 생성자 상속
		this.studentNo = studentNo;
	}
}
