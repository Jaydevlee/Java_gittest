package chap07.sec02.객체타입확인;

public class InstanceofExample {
	public static void method1(Parent parent) { //Parent parent = new Child();
		if(parent instanceof Child) { //상속 관계를 판별 == true, 자동 타입변환이 이루어 졌는지 판단 why? 강제 변환전에 자동 변환이 선행되어야 한다.
			// 자식클래스 = (자식클래스)부모클래스: 강제 타입 변환
			Child child = (Child)parent;
			System.out.println("method1 - child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환되지 않음");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("method2 - child로 변환 성공");
	}

	public static void main(String[] args) { //main 먼저 실행
		Parent parentA = new Child(); // 자동 참조 타입 변환
		System.out.println("metho2-child로 변환 성공");
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent(); // Parnet타입 = Parent 타입(자기 자신을 저장함): 자동 타입변환x
		method1(parentB); //instanceof를 사용하여 변환되지 않음을 출력
		method2(parentB); //instnaceof를 사용하지 않으면 컴파일 에러
	}

}
