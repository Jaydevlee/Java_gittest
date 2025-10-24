package chap07.sec02.확인문제.Q3;

public class Controller {
	//필드 MemberService타입의 변수 service
	public MemberService service;
	//생성자
	//메소드
	public void setService(MemberService service) {
		this.service = service;
	}

	public static void main(String[] args) {
	//controller 갹체 생성
	Controller controller = new Controller();
	controller.setService(new MemberService());
	                     //MemberSerivce service = new MemberService() MemberService 클래스 참조
	controller.service.login();
	
	controller.setService(new AService());
    //MemberSerivce service = AService()  자동 형변환 (M-부모 A-자손) ASerivce 참조
	controller.service.login();
	}

}
