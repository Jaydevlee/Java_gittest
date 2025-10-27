package chap09.sec02.확인문제.Q1;

public class AnonymousExample {

	public static void main(String[] args) {
		//객체 생성
		Anonymous anony = new Anonymous();
		
		anony.field.start();
		
		//anony method1 호출
		anony.method1();
		
		anony.method2(
			new Worker() {
				@Override
				public void start() {
					System.out.println("테스트를 합니다.");
				}
			}
		);

	}

}
