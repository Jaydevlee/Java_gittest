package chap06.chap6_5;

public class CardExample {

	public static void main(String[] args) {
		//클로버 A 카드
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
		
		System.out.println("card의 크기: " + card1.width + "x" + card1.height + "이다.");
		System.out.println("card의 색상: " + card1.color + "이고, 모양은 " + card1.shape + "이며, 숫자는 " + card1.number);
		
		System.out.println("card의 크기: " + card2.width + "x" + card2.height + "이다.");
		System.out.println("card의 색상: " + card2.color + "이고, 모양은 " + card2.shape + "이며, 숫자는 " + card2.number);
	}

}
