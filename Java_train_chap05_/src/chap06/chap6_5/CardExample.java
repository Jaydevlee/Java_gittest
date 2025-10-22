package chap06.chap6_5;

public class CardExample {

	public static void main(String[] args) { //정적 메소드, 리턴값이 없는 메소드
		//정적멤버접근 new키워드x
		Card.width = 63;
		Card.height = 89;
		
		Card card1 = new Card();
		card1.width = 63;
		card1.height = 89;
		
		card1.color = "black";
		card1.shape = "colover";
		card1.number = "A";
		
		//하트 A 카드
		Card card2 = new Card();
		card2.width = 63;
		card2.height = 89;
		
		card2.color = "red";
		card2.shape = "heart ";
		card2.number = "A";
		
		System.out.println("card1의 크기: " + card1.width + "x" + card1.height + "이다.");
		System.out.println("card1의 색상: " + card1.color + "이고, 모양은 " + card1.shape + "이며, 숫자는 " + card1.number);
		
		System.out.println("card2의 크기: " + card2.width + "x" + card2.height + "이다.");
		System.out.println("card2의 색상: " + card2.color + "이고, 모양은 " + card2.shape + "이며, 숫자는 " + card2.number);
		//이렇게 보면 인스턴스와 정적멤버의 차이를 알 수 없다.
		
		//card2의 넓이와 높이 변경
		card2.width = 100;
		card2.height = 200;
		System.out.println("card1의 크기: " + card1.width + "x" + card1.height + "이다.");
		System.out.println("card1의 색상: " + card1.color + "이고, 모양은 " + card1.shape + "이며, 숫자는 " + card1.number);
		
		System.out.println("card2의 크기: " + card2.width + "x" + card2.height + "이다.");
		System.out.println("card2의 색상: " + card2.color + "이고, 모양은 " + card2.shape + "이며, 숫자는 " + card2.number);
		//card2 뿐만 아닌 card1의 높이와 넓이도 같이 변한다. 이는 정적멤버
	}

}
