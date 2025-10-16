package chap02_2;

public class Str_escape {

	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업");	//println: 강제개행
		System.out.print("행 단위 출력\n");  //print: 줄 바꿈 x \n으로 줄 바꿈 필요함
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄\\여름\\가을\\겨울");
	}

}
