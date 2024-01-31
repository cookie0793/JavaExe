package ch08.class09;

import ch08.class09.Answer1Seller;

public class Answer1Buyer {
	private int money;
	private int numOfApple;
	
	public Answer1Buyer(int money) {
		this.money = money;
		this.numOfApple = 0;
	}
	public void buyApple(Answer1Seller seller, int money) {
		this.numOfApple += seller.saleApple(money);
		this.money -= money;
	}
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("사과 개수 : " + numOfApple);
	}
}

