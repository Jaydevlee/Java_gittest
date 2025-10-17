package chap05.chap05_3;

public class 확인문제 {

	public static void main(String[] args) {
		LoginResult result = LoginResult.FAIL_PASSWORD;
		
		if(result == LoginResult.SUCESS) {
			System.out.println("로그인 성공");
		} else if (result == LoginResult.FAIL_ID) {
			System.out.println("ID가 틀립니다.");
		} else if (result == LoginResult.FAIL_PASSWORD) {
			System.out.println("비밀번호가 틀립니다.");
		}

	}

}
