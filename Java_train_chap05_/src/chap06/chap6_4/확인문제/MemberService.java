package chap06.chap6_4.확인문제;

public class MemberService {
	String id;
	String password;
	
	boolean login(String id, String password) {
		if(this.id.equals("hong") && this.password.equals("12345")) {
			return true;
		} else {
			return false; //false일 때도 return이 필요하다.
		}
	}
	
	void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
}
