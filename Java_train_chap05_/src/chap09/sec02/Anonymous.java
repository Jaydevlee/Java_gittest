package chap09.sec02;

public class Anonymous {
	/* 익명 객체 */
	//필드 초기값으로 대입
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	/* 익명 객체 */
	
	void method1() {
		/* 익명 객체 */
		//로컬 변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		/* 익명 객체 */
		
		//로컬변수 사용
		localVar.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}
