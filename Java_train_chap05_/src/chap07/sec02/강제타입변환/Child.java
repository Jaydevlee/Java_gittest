package chap07.sec02.강제타입변환;

public class Child extends Parent{
	//Parent 필드 상속
	public String field2;
	//생성자 기본 생성자 자동 생성
	/*public Child(){
	 * super();
	*/
	
	//메소드
	//Parent 메소드 상속 받음
	public void method3() {
		System.out.println("Child-method3");
	}
}

