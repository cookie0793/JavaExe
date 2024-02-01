package ch08.class09.answer03;

public class PearBuyer {
	private int money;
	private int numOfPear;
	
	public PearBuyer(int money) {
		this.money = money;
		this.numOfPear = 0;
	}
	public void buyPear(PearSeller seller, int money) {
		this.numOfPear += seller.salePear(money);
		this.money -= money;
	}
	public void showBuyResult() {
		System.out.println("*** 배 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("배 개수 : " + numOfPear);
	}
	
}
