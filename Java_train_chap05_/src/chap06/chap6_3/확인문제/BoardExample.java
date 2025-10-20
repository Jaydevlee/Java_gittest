package chap06.chap6_3.확인문제;

public class BoardExample {

	public static void main(String[] args) {
		Board board1 = new Board("제목", "내용");
		Board board2 = new Board("제목", "내용", "로그인한 회원아이디");
		Board board3 = new Board("제목", "내용", "로그인한 회원아이디", "현재 컴퓨터 날짜");
		Board board4 = new Board("제목", "내용", "로그인한 회원아이디", "현제 컴퓨터 날짜", 0);
		
		System.out.println("제목: " + board1.title + ", 내용: " + board1.content + ", 작가: " + board1.writer + ", 날짜: " + board1.date + ", 추천수: " + board1.hitcount);
		System.out.println("제목: " + board2.title + ", 내용: " + board2.content + ", 작가: " + board2.writer + ", 날짜: " + board2.date + ", 추천수: " + board2.hitcount);
		System.out.println("제목: " + board3.title + ", 내용: " + board3.content + ", 작가: " + board3.writer + ", 날짜: " + board3.date + ", 추천수: " + board3.hitcount);
		System.out.println("제목: " + board4.title + ", 내용: " + board4.content + ", 작가: " + board4.writer + ", 날짜: " + board4.date + ", 추천수: " + board4.hitcount);
		
	}

}
