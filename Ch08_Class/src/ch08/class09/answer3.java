package ch08.class09;

public class answer3 {
	public static void main(String[] args) {
		
	}
	private int money; 
	final int PEAR = 2500;
	
	public void buyPear(int money) {
		int num = money-PEAR;
		
		System.out.println("나는 마트에가서 " + money + "원을 주고 배 가격" + PEAR + "를 샀다");
	}

}
