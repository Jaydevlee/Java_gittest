package chap08.sec02.확인문제;

public class MySqlDao implements DataAccessObject {
	//메소드
	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("MySql DB에 삽입");
	}
	@Override
	public void update() {
		System.out.println("MySql DB를 수정");
	}
	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}

}
