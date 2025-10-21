package chap06.chap6_5;

public class SingletonExample {

	public static void main(String[] args) {
		//new 사용x, 단 하나만 생성할 수 있기 때문이다.
		/* 
		 Singleton obj1 = new singleton();
		 Singleton obj1 = new singleton();
		 */
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("");
		}
	}

}
