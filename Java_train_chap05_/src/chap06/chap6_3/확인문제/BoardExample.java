package chap06.chap6_3.확인문제;

public class BoardExample {

	public static void main(String[] args) {
		Board board1 = new Board("제목", "내용");
		Board board2 = new Board("제목", "내용", "로그인한 회원아이디");
		Board board3 = new Board("제목", "내용", "로그인한 회원아이디", "현재 컴퓨터 날짜");
		Board board4 = new Board("제목", "내용", "로그인한 회원아이디", "현제 컴퓨터 날짜", 0);
		
		System.out.println("제목: " + board1.title + ", 내용: " + board1.content + ", 작가: " + board1.writer);
		System.out.println(board2);
		System.out.println(board3);
		System.out.println(board4);
		
		
	}

}
