package chap06.chap6_5.확인문제;


public class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return singleton;
	}
	
}
