package chap09.sec02.확인문제.Q1;

public class Anonymous {
	//익명 객체 필드
	Worker field = new Worker() {
		@Override
		public void start() {
			System.out.println("디자인을 합니다.");
		}
	};
	//익명 객체로 로컬 변수 초기화
	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("개발을 합니다.");
			}
		};
		localVar.start();
	}
	//메소드의 매개값(익명 객체)
	void method2(Worker worker) {
		worker.start();
	}
}
