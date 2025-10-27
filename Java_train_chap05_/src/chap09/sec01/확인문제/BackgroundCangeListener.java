package chap09.sec01.확인문제;

public class BackgroundCangeListener implements CheckBox.OnSelectListener {
	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다");
	}
}
