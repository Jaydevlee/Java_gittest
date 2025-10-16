package chap02_4;

public class 입력_3 {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) { //q를 입력하면 반복 종료
				break;
			}
		}

	}

}
