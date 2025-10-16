package chap05.chap05_1;

public class 확인문제5 {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 10;
		String var3 = "AB";
		String var4 = "AB";
		String var5 = new String("AB");
		
		boolean result1 = (var1 == var2);
		boolean result2 = (var1 != var2);
		boolean result3 = (var3 == var4);
		boolean result4 = (var3 != var5);
		boolean result5 = (var4.equals(var5));
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
	}

}
