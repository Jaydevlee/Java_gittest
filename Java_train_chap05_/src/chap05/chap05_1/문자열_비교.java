package chap05.chap05_1;

public class 문자열_비교 {

	public static void main(String[] args) {
		String strVar1 = "개발자";
		String strVar2 = "개발자";
		
		if(strVar1 == strVar2) { //== -> 주소를 비교
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) { //equals -> 문자열 비교
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		String strVar3 = new String("개발자");
		String strVar4 = new String("개발자");
		
		if(strVar3 == strVar4) { //== -> 주소를 비교
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		if(strVar3.equals(strVar4)) { //equals -> 문자열 비교
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
