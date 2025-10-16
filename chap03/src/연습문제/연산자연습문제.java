package 연습문제;

public class 연산자연습문제 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';
		byte z = 7;
		byte z1 = ++z;
		
		System.out.println(1 + x << 33); // << 연산자 쉬프트연산자(비트이동 연산자) 왼쪽으로 비트를 우항만큼 이동시켜라 비트: 데이터의 최소단위 (1byte = 8bit) 
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++); // x++부터 먼저연산 왜? 단항이니까 후위 연산자임으로 모든 연산이 끝난 후 증가
		System.out.println(x += 2); //위에서 x++연산으로 x = 3이된다. 
		System.out.println(!('A' <= c && c <= 'Z')); //'a'같은 문자는 아스키코드 활용
		System.out.println('C' - c);
		System.out.println('5'-'0');
		System.out.println(c + 1);
		System.out.println(++c); //단항연산자는 기존타입 그대로 따라간다, 아스키코드가 아닌 문자를 출력 이항연산자일 경우에 자동형변환
		System.out.println(c++); //66을 저장하고 67로 증가
		System.out.println(c); // 아스키코드 67
		System.out.println(z1);
	}

}
