package chap09.sec01.확인문제;

public class CheckBox {
	OnSelectListener listener;
	
	void setOnSelectListner(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.OnSelect();
	}
	
	static interface OnselectListener{
		void onSelect();
	}
}
