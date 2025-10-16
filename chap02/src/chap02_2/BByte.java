package chap02_2;

public class BByte {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128;
		byte var6 = (byte)(var5 + 1); //overflow 원인 128은 저장범위를 벗어남 따라서 -128로 돌아감 자바는 기본적으로 정수를 int로 인식한다.
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}
}
