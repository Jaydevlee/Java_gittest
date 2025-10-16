package chap02_2;

public class Long {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; 자바는 정수를 int로 인식한다. 따라서 뒤에 L을 붙여서 long로 인식하게 해야함 (소문자 l은 숫자1과 혼동하기 쉬움 일반적으로 L사용
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
