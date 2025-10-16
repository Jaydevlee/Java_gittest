package chap04_2;

public class 구구단For문활용 {

	public static void main(String[] args) {
		Stop: for(int m=2; m<=9; m++) {
			System.out.println("***" + m + "단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m + "x" + n + "=" + (m * n));
				if(n == 9) {
					break Stop;
				}
			}
		}

	}

}
