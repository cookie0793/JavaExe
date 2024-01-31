package ch08.class09;

import ch08.class09.Answer1Buyer;

public class Answer1Main {
	public static void main(String[] args) {
		Answer1Seller seller = new Answer1Seller(20);
		Answer1Buyer buyer = new Answer1Buyer(10000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
		
		seller.saleApple(buyer, 2000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
	}
}
