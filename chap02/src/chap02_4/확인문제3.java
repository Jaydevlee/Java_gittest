package chap02_4;

import java.util.Scanner;

public class 확인문제3 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scanner.nextLine(); //이름
		
		System.out.print("주민번호 앞 6자리: ");
		String personID = scanner.nextLine();
		
		System.out.print("전화번호: ");
		String tel = scanner.nextLine();
		
		System.out.println("이름: " + name);
		System.out.println("주민번호 앞 6자리: " + personID);
		System.out.println("전화번호: " + tel);
	}

}
