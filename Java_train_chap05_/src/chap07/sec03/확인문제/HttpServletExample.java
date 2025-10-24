package chap07.sec03.확인문제;

public class HttpServletExample {

	public static void main(String[] args) {
		//HttpServletExample 자신의 메소드 호출
		method(new LoginServlet());
		method(new FileDownloadServlet());
		}
	//메소드 선언
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
