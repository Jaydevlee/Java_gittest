package chap09.sec01.중첩인터페이스;

public class MessangerListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("메시지를 겁니다.");
	}
}
