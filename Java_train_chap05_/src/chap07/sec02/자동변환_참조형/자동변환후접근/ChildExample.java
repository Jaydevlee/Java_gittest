package chap07.sec02.자동변환_참조형.자동변환후접근;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //자동 참조 타입 변환
		
		parent.method1();
		parent.method2(); //타입변환 + 자식이 부모 method2를 override 따라서 호출 o(다향성 적용), override 되지 않으면 부모 method2 그대로 호출
		//parent 참조 변수는 Parent클래스 타입(참조타입)이므로, Parent클래스의 필드와 메소드에만 접근 가능
		//parent.method3(); 컴파일 에러 why? 자동 타입변환 되면 자식메소드는 부모메서드를 재정의 하지 않는 이상 호출 x
	}

}
